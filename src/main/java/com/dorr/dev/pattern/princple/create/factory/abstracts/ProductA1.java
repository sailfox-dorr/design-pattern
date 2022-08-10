package com.dorr.dev.pattern.princple.create.factory.abstracts;

public class ProductA1 implements Product1{
    @Override
    public void method1() {
        System.out.println("产品A1 调用方法1");
    }

    @Override
    public void method2() {

        System.out.println("产品A1 调用方法2");
    }
}
