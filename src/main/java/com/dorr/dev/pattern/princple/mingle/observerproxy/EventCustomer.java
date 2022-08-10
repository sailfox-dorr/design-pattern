package com.dorr.dev.pattern.princple.mingle.observerproxy;

import java.util.Vector;

//抽象事件处理类
public abstract class EventCustomer {
    private Vector<ProductEventType> vector = new Vector<ProductEventType>();        //构造函数

    public EventCustomer(ProductEventType type) {
        vector.add(type);
    }

    public void addEventType(ProductEventType type) {
        vector.add(type);
    }

    public Vector<ProductEventType> getCustomType() {
        return vector;
    }

    public abstract void exec(ProductEvent event);
}