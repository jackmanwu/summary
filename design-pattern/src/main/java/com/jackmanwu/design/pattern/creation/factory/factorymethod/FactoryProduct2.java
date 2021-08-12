package com.jackmanwu.design.pattern.creation.factory.factorymethod;

import com.jackmanwu.design.pattern.creation.factory.simplefactory.Product;
import com.jackmanwu.design.pattern.creation.factory.simplefactory.ProductImpl2;

public class FactoryProduct2 extends Factory{
    @Override
    Product factoryMethod() {
        return new ProductImpl2();
    }
}
