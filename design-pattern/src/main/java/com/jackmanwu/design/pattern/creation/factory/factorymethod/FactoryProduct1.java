package com.jackmanwu.design.pattern.creation.factory.factorymethod;

import com.jackmanwu.design.pattern.creation.factory.simplefactory.Product;
import com.jackmanwu.design.pattern.creation.factory.simplefactory.ProductImpl1;

public class FactoryProduct1 extends Factory {
    @Override
    Product factoryMethod() {
        return new ProductImpl1();
    }
}
