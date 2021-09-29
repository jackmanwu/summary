package concurrent.mq;

public interface Model {
    Runnable newRunnableConsumer();
    Runnable newRunnableProducer();
}
