package com.dorr.dev.pattern.princple.mingle.observerproxy;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

// 观察者
public class EventDispatch implements Observer {        //单例模式
    private static EventDispatch dispatch = new EventDispatch();        //事件处理者
    private Vector<EventCustomer> customers = new Vector<EventCustomer>();        //不允许生成新的实例

    private EventDispatch() {
    }        //获得单例对象

    public static EventDispatch getEventDispatch() {
        return dispatch;
    }        //事件触发

    public void update(Observable o, Object arg) {
        Product p = (Product) arg;            //事件
        ProductEvent event = (ProductEvent) o;
        //处理者处理事件，中介者模式的核心
        // 此处由begger 来处理事件而不是直接由 dispatcher 对event进行处理
        for (EventCustomer e : customers) {
            for (ProductEventType t : e.getCustomType()) {
                if (t.getValue() == event.getEventType().getValue()) {
                    e.exec(event);
                }
            }
        }
    }        //注册事件处理者

    public void registerCustomer(EventCustomer customer) {
        customers.add(customer);
    }
}