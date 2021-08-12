package design.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 */
public class SubjectImpl implements Subject {
    private List<Observer> observers;
    private Integer price;

    public SubjectImpl() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObserver();
    }
}
