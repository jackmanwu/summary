package design.pattern.creation.factory.abstractfactory;

public class Factory1 extends AbstractFactory {
    @Override
    public AbstractProduct1 createProduct1() {
        return new ProductA1();
    }

    @Override
    public AbstractProduct2 createProduct2() {
        return new ProductB1();
    }
}
