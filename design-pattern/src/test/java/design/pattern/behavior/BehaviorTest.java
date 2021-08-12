package design.pattern.behavior;

import design.pattern.behavior.chain.*;
import design.pattern.behavior.observer.*;
import design.pattern.behavior.strategy.Robot;
import design.pattern.behavior.strategy.StrategyA;
import design.pattern.behavior.strategy.StrategyB;
import org.junit.Test;

public class BehaviorTest {
    @Test
    public void testObserver() {
        SubjectImpl subject = new SubjectImpl();
        Observer observer1 = new ObserverImpl1(subject);
        Observer observer2 = new ObserverImpl2(subject);
        subject.setPrice(10);
    }

    @Test
    public void testChain() {
        Handler mouseHandler = new MouseHandler(null);
        Handler keyboardHandler = new KeyboardHandler(mouseHandler);
        Request request1 = new Request(RequestType.TYPE1, "mouse");
        Request request2 = new Request(RequestType.TYPE2, "keyboard");
        keyboardHandler.handle(request1);
        keyboardHandler.handle(request2);
    }

    @Test
    public void testStrategy() {
        Robot robot = new Robot();
        robot.setStrategy(new StrategyA());
        robot.speak();
        robot.setStrategy(new StrategyB());
        robot.speak();
    }
}
