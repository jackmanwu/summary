package concurrent.mq;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditionModel implements Model {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private final Queue<Task> queue = new LinkedList<>();
    private final int capacity;
    private final TaskService taskService;

    public LockConditionModel(int capacity, TaskService taskService) {
        this.capacity = capacity;
        this.taskService = taskService;
    }

    @Override
    public Runnable newRunnableConsumer() {
        return new ConsumerImpl();
    }

    @Override
    public Runnable newRunnableProducer() {
        return new ProducerImpl();
    }

    private class ConsumerImpl extends AbstractConsumer implements Consumer, Runnable {

        @Override
        public void consume() throws InterruptedException {
            lock.lockInterruptibly();
            try {
                while (queue.size() == 0) {
                    condition.await();
                }
                Task task = queue.poll();
                JobContext context = new JobContext(5);
                int sum = context.parallelHandle(task.getList());
                System.out.println("consume task: " + task.getList() + " ,result: " + sum);
                condition.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }

    private class ProducerImpl extends AbstractProducer implements Producer, Runnable {

        @Override
        public void produce() throws InterruptedException {
            lock.lockInterruptibly();
            try {
                while (queue.size() >= capacity) {
                    condition.await();
                }
                Task task = taskService.mockGetFromDB();
                System.out.println("produce task no: " + task.getList());
                queue.offer(task);
                condition.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }
}
