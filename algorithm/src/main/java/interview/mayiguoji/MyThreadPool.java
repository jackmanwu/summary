package interview.mayiguoji;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 手撕线程池
 */
public class MyThreadPool {
    private int maxCount;
    private int maxWaiterCount;
    private AtomicInteger activeCount;
    private BlockingQueue<Runnable> blockingQueue;

    public MyThreadPool(int maxCount, int maxWaiterCount) {
        this.maxCount = maxCount;
        this.maxWaiterCount = maxWaiterCount;
    }

    public void execute(Runnable runnable) {
        if (activeCount.get() < maxCount) {

        }
    }

    class Worker implements Runnable {
        private Thread thread;
        private Runnable task;

        public Worker(Runnable task) {
            this.task = task;
            thread = new Thread(this);
        }

        @Override
        public void run() {
            Runnable task = blockingQueue.poll();
        }
    }
}
