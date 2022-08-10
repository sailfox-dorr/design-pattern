package com.dorr.dev.pattern.princple.behavior.observer;

// 抽象主题
public interface Subject {

    // 登记一个新的订阅者
    void attach(Subscriber subscriber);

    // 删除一个订阅者
    void detach(Subscriber subscriber);

    void notifySubscriber();
}
