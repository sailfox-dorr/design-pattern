package com.dorr.dev.pattern.princple.structure.decorator;

public class DecoratorDemo {
    /**
     *
     * @param args
     *
     * 装饰者模式
     * ■ 需要扩展一个类的功能，或给一个类增加附加功能。
     * ■ 需要动态地给一个对象增加功能，这些功能可以再动态地撤销。
     * ■ 需要为一批类进行改装或加装功能。
     * 装饰者模式是对继承的有力补充
     */

    public static void main(String[] args) {

        Subsystem subsystem = new Subsystem();


        ConcreteDecorator3 decorator= new ConcreteDecorator3(
                new ConcreteDecorator2(
                        new ConcreteDecorator(subsystem)
                ));

        decorator.operation();



    }
}
