package design.pattern.behavior.observer;

public class ObserverImpl2 implements Observer {
    public ObserverImpl2(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(int price) {
        System.out.printf("ObserverImpl2.update,price: %d \n", price);
    }
}
