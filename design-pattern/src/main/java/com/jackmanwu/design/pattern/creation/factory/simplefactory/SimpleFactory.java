package com.jackmanwu.design.pattern.creation.factory.simplefactory;

/**
 * 简单工厂
 */
public class SimpleFactory {
    public Product createProduct(int type) {
        if (type == 1) {
            return new ProductImpl1();
        } else if (type == 2) {
            return new ProductImpl2();
        } else if (type == 3) {
            return new ProductImpl3();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
