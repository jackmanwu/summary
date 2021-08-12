package design.pattern.behavior.chain;

public class MouseHandler extends Handler {
    public MouseHandler(Handler handler) {
        super(handler);
    }

    @Override
    public void handle(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.printf("MouseHandler handle,name: %s\n", request.getName());
        } else if (handler != null) {
            handler.handle(request);
        }
    }
}
