package com.dorr.dev.pattern.princple.mingle.observerproxy;

public class ObserverProxyDemo {
    // 针对事件触发机制  可以使用 观察中介者模式

    public static void main(String args[]) {
        // EventDispatch  observer
        // ProductManager ProductEvent 工厂类
        // ProductEvent   observable
        // EventCustomer  作为ProductEvent的代理处理角色
        // EventCustomer  理论上还可以再做成多级代理

        //获得事件分发类

        //
        // 工厂方法模式：负责生产、修改、克隆及销毁产品对象，实现了产品和工厂的耦合，避免产品随意被创建而无触发事件的情况发生。
        // 桥梁模式：在产品和事件两个对象的关系中采用了桥梁模式，以便两者可以自由地扩展，而不破坏其封装。
        // 观察者模式：事件分发类是观察者，用于注册事件处理者，当产生事件时通知事件处理者，并调用相应的事件处理方法。
        // 中介者模式：使用中介者对事件和处理者之间进行耦合。



        EventDispatch dispatch = EventDispatch.getEventDispatch();            //接受乞丐对事件的处理
        dispatch.registerCustomer(new Beggar());              //接受平民对事件的处理
        dispatch.registerCustomer(new Commoner());            //接受贵族对事件的处理
        dispatch.registerCustomer(new Nobleman());            //建立一个产品生产工厂
        ProductManager pm = new ProductManager();               //制造一个产品
        Product p = pm.createProduct("IBM笔记本电脑 ");            //修改一个产品
        pm.editProduct(p, "Dell笔记本电脑 ");            //克隆一个产品
        pm.clone(p);                          //销毁产品
        pm.abandonProduct(p);
    }
}
