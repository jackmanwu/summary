package concurrent.mq;

public interface Producer {
    void produce() throws InterruptedException;
}
