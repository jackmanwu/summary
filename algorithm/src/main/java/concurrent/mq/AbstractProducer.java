package concurrent.mq;

public abstract class AbstractProducer implements Producer, Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                produce();
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
