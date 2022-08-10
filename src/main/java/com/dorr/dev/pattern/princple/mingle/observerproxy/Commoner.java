package com.dorr.dev.pattern.princple.mingle.observerproxy;

//平民
public class Commoner extends EventCustomer {    //定义平民能够处理的事件的级别
    public Commoner() {
        super(ProductEventType.NEW_PRODUCT);
    }

    public void exec(ProductEvent event) {
        Product p = event.getSource();            //事件类型
        ProductEventType type = event.getEventType();
        System.out.println("平民处理事件： " + p.getName() + "创建，事件类型 =" + type);
    }
}