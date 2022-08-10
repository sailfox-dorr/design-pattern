package com.dorr.dev.pattern.princple.structure.decorator;

public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }


    @Override
    public void operation(){
        System.out.println("------ 第一次装饰 ---------");
        super.operation();
        System.out.println("------ 第一次装饰 ---------");
    }
}
