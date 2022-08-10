package com.dorr.dev.pattern.princple.create.factory.abstracts;

public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public Product1 factory1() {
        return new ProductA1();
    }

    @Override
    public Product2 factory2() {
        return new ProductA2();
    }
}
