package com.dorr.dev.pattern.princple.structure.flyweight;

public class FlyWeightDemo {

    /**
     * 线程池技术的应用  避免碎片式的内存调用。
     *
     * 系统中有大量的相似对象，这些对象耗费大量的内存。
     * 细粒度的对象都具备较接近的外部状态，而且内部状态与环境无关，即对象没有特定身份。
     * 需要缓冲池的场景。
     *
     *
     * 系统中有大量的相似对象，这些对象耗费大量的内存。
     * 细粒度的对象都具备较接近的外部状态，而且内部状态与环境无关，即对象没有特定身份。
     * 需要缓冲池的场景。
     */

    public static void main(String[] args) {

        FlyWeight a = FlyWeightFactory.get("A");
        a.operation("B");


        FlyWeight b = FlyWeightFactory.get("B");
        b.operation("A");
    }
}
