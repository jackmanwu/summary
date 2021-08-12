package design.pattern.creation.factory.abstractfactory;

public class Facotry2 extends AbstractFactory {
    @Override
    public AbstractProduct1 createProduct1() {
        return new ProductA2();
    }

    @Override
    public AbstractProduct2 createProduct2() {
        return new ProductB2();
    }
}
