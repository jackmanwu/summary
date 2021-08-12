package design.pattern.creation.factory.factorymethod;

import design.pattern.creation.factory.simplefactory.Product;
import design.pattern.creation.factory.simplefactory.ProductImpl2;

public class FactoryProduct2 extends Factory{
    @Override
    Product factoryMethod() {
        return new ProductImpl2();
    }
}
