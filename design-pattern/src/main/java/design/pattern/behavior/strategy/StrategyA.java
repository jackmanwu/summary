package design.pattern.behavior.strategy;

public class StrategyA implements Strategy {
    @Override
    public void speak() {
        System.out.println("strategy a speak:a~ a~");
    }
}
