package com.dorr.dev.pattern.princple.create.factory;

public class FactoryDemo {
    /**
     * 简单工厂模式
     * @param args
     */
    public static void main(String[] args) {

        // 工厂粒度
        Creator concreteCreator = new ConcreteCreator();
        // 产品粒度
        Product product = concreteCreator.factory(ConcreteProduct.class);
        product.method1();
    }
}
