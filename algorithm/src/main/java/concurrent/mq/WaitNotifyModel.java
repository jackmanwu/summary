package concurrent.mq;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class WaitNotifyModel implements Model {
    private final Object LOCK = new Object();
    private final Queue<Task> queue = new LinkedList<>();
    private final int capacity;
    private final TaskService taskService;

    public WaitNotifyModel(int capacity, TaskService taskService) {
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
            synchronized (LOCK) {
                while (queue.size() == 0) {
                    System.out.println("consume wait");
                    LOCK.wait();
                }
                Task task = queue.poll();
                JobContext context = new JobContext(5);
                int sum = context.parallelHandle(task.getList());
                System.out.println("consume task: " + task.getList() + " ,result: " + sum);
                LOCK.notifyAll();
            }
        }
    }

    private class ProducerImpl extends AbstractProducer implements Producer, Runnable {
        @Override
        public void produce() throws InterruptedException {
            Thread.sleep(ThreadLocalRandom.current().nextLong(1000));
            synchronized (LOCK) {
                while (queue.size() >= capacity) {
                    System.out.println("produce wait");
                    LOCK.wait();
                }
                Task task = taskService.mockGetFromDB();
                System.out.println("produce task no: " + task.getList());
                queue.offer(task);
                LOCK.notifyAll();
            }
        }
    }
}
