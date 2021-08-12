package design.pattern.behavior.chain;

public class KeyboardHandler extends Handler {
    public KeyboardHandler(Handler handler) {
        super(handler);
    }

    @Override
    public void handle(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.printf("KeyboardHandler handle,name: %s\n", request.getName());
        } else if (handler != null) {
            handler.handle(request);
        }
    }
}
