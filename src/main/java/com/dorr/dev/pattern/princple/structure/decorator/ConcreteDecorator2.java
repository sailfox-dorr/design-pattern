package com.dorr.dev.pattern.princple.structure.decorator;

public class ConcreteDecorator2 extends Decorator{
    public ConcreteDecorator2(Component component) {
        super(component);
    }
    @Override
    public void operation(){
        System.out.println("------ 第二次装饰 ---------");
        super.operation();
        System.out.println("------ 第二次装饰 ---------");
    }
}
