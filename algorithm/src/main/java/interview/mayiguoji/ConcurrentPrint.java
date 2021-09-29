package interview.mayiguoji;

public class ConcurrentPrint {
    private static final Object LOCK = new Object();

    public static void main(String[] args) {
        new Thread(new Worker(LOCK), "线程1").start();
        new Thread(new Worker(LOCK), "线程2").start();
    }

    private static class Worker implements Runnable {
        private final Object lock;

        public Worker(Object lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + "-" + i);
                    lock.notify();
                    if (i < 100) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
