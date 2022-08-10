package com.dorr.dev.pattern.princple.create.factory.abstracts;

public class AbstractFactoryDemo {

    // 抽象工厂模式 主要针对的是一族产品的约束

    public static void main(String[] args) {
        ConcreteFactory1 fa = new ConcreteFactory1();
        Product1 pa1  = fa.factory1();
        pa1.method1();
        Product2 pa2 = fa.factory2();
        pa2.method1();
    }
}
