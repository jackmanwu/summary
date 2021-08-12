package com.jackmanwu.design.pattern.creation.simplefactory;

import com.jackmanwu.design.pattern.creation.factory.abstractfactory.AbstractFactory;
import com.jackmanwu.design.pattern.creation.factory.abstractfactory.AbstractProduct1;
import com.jackmanwu.design.pattern.creation.factory.abstractfactory.AbstractProduct2;
import com.jackmanwu.design.pattern.creation.factory.abstractfactory.Factory1;
import com.jackmanwu.design.pattern.creation.factory.factorymethod.FactoryProduct1;
import com.jackmanwu.design.pattern.creation.factory.simplefactory.Product;
import com.jackmanwu.design.pattern.creation.factory.simplefactory.ProductImpl2;
import com.jackmanwu.design.pattern.creation.factory.simplefactory.SimpleFactory;
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
