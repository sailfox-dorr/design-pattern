package com.dorr.dev.pattern.princple.mingle.observerproxy;

import java.util.Observable;

public class ProductEvent extends Observable {        //事件源
    private Product source;        //事件类型
    private ProductEventType type;        //构造函数

    public ProductEvent(Product p) {
        this(p, ProductEventType.NEW_PRODUCT);
    }

    public ProductEvent(Product p, ProductEventType type) {
        this.source = p;
        this.type = type;            //事件触发
        notifyEventDispatch();
    }        //获得事件源

    public Product getSource() {
        return source;
    }        //获得事件的类型

    public ProductEventType getEventType() {
        return this.type;
    }        //触发事件处理

    private void notifyEventDispatch() {
        super.addObserver(EventDispatch.getEventDispatch());
        super.setChanged();
        super.notifyObservers(source);
    }
}
