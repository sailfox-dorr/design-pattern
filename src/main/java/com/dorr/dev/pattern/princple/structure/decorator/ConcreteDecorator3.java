package com.dorr.dev.pattern.princple.structure.decorator;

public class ConcreteDecorator3 extends Decorator{
    public ConcreteDecorator3(Component component) {
        super(component);
    }


    @Override
    public void operation(){
        System.out.println("------ 第三次装饰 ---------");
        super.operation();
        System.out.println("------ 第三次装饰 ---------");
    }
}
