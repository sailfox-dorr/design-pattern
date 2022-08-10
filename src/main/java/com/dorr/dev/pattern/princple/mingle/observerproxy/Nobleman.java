package com.dorr.dev.pattern.princple.mingle.observerproxy;

//贵族
public class Nobleman extends EventCustomer {
    public Nobleman() {
        super(ProductEventType.EDIT_PRODUCT);
        super.addEventType(ProductEventType.CLONE_PRODUCT);
    }

    public void exec(ProductEvent event) {
        Product p = event.getSource();            // 事件类型
        ProductEventType type = event.getEventType();
        if (type.getValue() == ProductEventType.CLONE_PRODUCT.getValue()) {
            System.out.println("贵族处理事件： " + p.getName() + "克隆，事件类型 =" + type);
        } else {
            System.out.println("贵族处理事件： " + p.getName() + "修改，事件类型 =" + type);
        }
    }
}