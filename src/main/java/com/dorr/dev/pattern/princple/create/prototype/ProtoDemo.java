package com.dorr.dev.pattern.princple.create.prototype;

public class ProtoDemo {
    /**
     * @author dorr
     *
     * 原型模式 主要适用于大对象创建需要较大开销
     * 所以提供创建创建重复使用的对象 同时又保证性能
     * 可以和工厂模式、单例等创建模式混用
     */

    public static void main(String[] args) {
        Circle circle = new Circle();
        Shape clone = (Shape) circle.clone();
        clone.draw();
    }
}
