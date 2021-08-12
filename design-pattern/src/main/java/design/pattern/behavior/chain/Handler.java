package design.pattern.behavior.chain;

/**
 * 责任链
 */
public abstract class Handler {
    protected Handler handler;

    public Handler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handle(Request request);
}
