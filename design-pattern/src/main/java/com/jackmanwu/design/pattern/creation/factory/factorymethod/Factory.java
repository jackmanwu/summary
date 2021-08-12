package com.jackmanwu.design.pattern.creation.factory.factorymethod;

import com.jackmanwu.design.pattern.creation.factory.simplefactory.Product;

/**
 * 工厂方法
 */
public abstract class Factory {
    abstract Product factoryMethod();

    public int doSomething() {
        Product product = factoryMethod();
        return product.getPrice();
    }
}
