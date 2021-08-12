package design.pattern.behavior.strategy;

import lombok.Setter;

@Setter
public class Robot {
    private Strategy strategy;

    public void speak() {
        if (strategy != null) {
            strategy.speak();
        }
    }
}
