package design.pattern.creation.simplefactory;

import design.pattern.creation.factory.abstractfactory.AbstractFactory;
import design.pattern.creation.factory.abstractfactory.AbstractProduct1;
import design.pattern.creation.factory.abstractfactory.AbstractProduct2;
import design.pattern.creation.factory.abstractfactory.Factory1;
import design.pattern.creation.factory.factorymethod.FactoryProduct1;
import design.pattern.creation.factory.simplefactory.Product;
import design.pattern.creation.factory.simplefactory.ProductImpl2;
import design.pattern.creation.factory.simplefactory.SimpleFactory;
import org.junit.Test;

public class SimpleFactoryTest {
    @Test
    public void testSimpleFactory() {
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.createProduct(2);
        assert product instanceof ProductImpl2;
    }

    @Test
    public void testFactoryMethod() {
        FactoryProduct1 product1 = new FactoryProduct1();
        assert product1.doSomething() == 10;
    }

    @Test
    public void testAbstractFactory() {
        AbstractFactory abstractFactory = new Factory1();
        AbstractProduct1 product1 = abstractFactory.createProduct1();
        AbstractProduct2 product2 = abstractFactory.createProduct2();
    }
}
