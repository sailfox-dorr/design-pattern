package com.dorr.dev.pattern.princple.behavior.state;

public class StateHandleDemo {

    public static void main(String[] args) {
        /**
         * 状态模式的优点
         * 结构清晰。
         * 遵循设计原则。
         * 封装性非常好。
         *
         * 状态模式的缺点如下。
         * 子类太多，不易管理。
         *
         * 状态模式适合的场景
         * 对象的行为依赖于它所处的状态，即行为随状态改变而改变的场景。
         * 对象在某个方法里依赖于一重或多重条件分支语句，此时可以使用状态模式将分支语句中的每一个分支都包装到一个单独的类中，
         * 使得这些条件分支语句能够以类的方式独立存在和演化。如此，维护这些独立的类就不再影响到系统的其他部分。
         */

        Context context = new Context();
        context.handle("oom");
        context.handle("healthy");
        context.handle("backpressure");
    }
}
