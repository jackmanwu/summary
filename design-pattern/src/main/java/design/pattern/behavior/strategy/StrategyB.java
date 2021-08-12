package design.pattern.behavior.strategy;

public class StrategyB implements Strategy {
    @Override
    public void speak() {
        System.out.println("strategy b speak:hello,this is me");
    }
}
