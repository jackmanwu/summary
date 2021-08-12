package com.jackmanwu.design.pattern.creation.factory.factorymethod;

import com.jackmanwu.design.pattern.creation.factory.simplefactory.Product;
import com.jackmanwu.design.pattern.creation.factory.simplefactory.ProductImpl3;

public class FactoryProduct3 extends Factory {
    @Override
    Product factoryMethod() {
        return new ProductImpl3();
    }
}
