package com.dorr.dev.pattern.princple.behavior.visitor.newinstance;

public class ComputerDemo {

    public static void main(String[] args) {
        /**
         * 访问者模式 构建一个硬件访问模型
         *
         * 访问者模式的缺点
         * 增加新的元素类变得很困难。每增加一个新的元素类都意味着要在抽象访问者角色中增加一个新的抽象操作，并在每一个具体访问者类中增加相应的具体操作。
         * 破坏封装。访问者模式要求访问者对象访问并调用每一个元素对象的操作，这隐含了一个对所有元素对象的要求，即必须暴露一些自己的操作和内部状态，否则访问者的访问就变得没有意义。由于访问者对象自己会积累访问操作所需的状态，从而使得这些状态不再存储在元素对象中，破坏了类的封装性。
         * 违背了依赖倒置原则。访问者依赖的是具体的元素，而不是抽象的元素，这破坏了依赖倒置的原则，特别是在面向对象的编程中，抛弃了对接口的依赖，而直接依赖实现类，扩展比较难。
         *
         * 适用的场景
         *
         *
         * 一个对象结构包含很多类对象，它们有不同的接口，当对这些对象实施依赖于具体类的操作时，即使用迭代器模式不能胜任的场景下，可以采用访问者模式。
         * 需要对一个对象结构中的对象进行很多不同并且不相关的操作，避免操作污染类。
         * 业务规则要求遍历多个不同的对象，这本身也是访问者模式的出发点，迭代器模式只能访问同类或同接口的数据，而访问者模式是对迭代器模式的扩充，可以遍历不同的对象，执行不同的操作。
         *
         *
         */

        Computer computer = new Computer();

        Cpu cpu = new Cpu();
        Gpu gpu = new Gpu();
        Disk disk = new Disk();

        computer.add(cpu)
                .add(gpu)
                .add(disk);

        HDUser1593 user = new HDUser1593();

        computer.visitedBy(user);
    }
}