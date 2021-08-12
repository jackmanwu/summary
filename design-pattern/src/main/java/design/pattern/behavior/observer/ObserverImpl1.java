package design.pattern.behavior.observer;

public class ObserverImpl1 implements Observer {
    public ObserverImpl1(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(int price) {
        System.out.printf("ObserverImpl1.update,price: %d \n", price);
    }
}
