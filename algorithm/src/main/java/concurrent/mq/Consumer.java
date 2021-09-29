package concurrent.mq;

public interface Consumer {
    void consume() throws InterruptedException;
}
