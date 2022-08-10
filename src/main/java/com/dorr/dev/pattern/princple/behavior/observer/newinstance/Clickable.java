package com.dorr.dev.pattern.princple.behavior.observer.newinstance;

public interface Clickable {
    // 点击
    void click();

    // 添加点击事件观察者
    void addClicker(ClickObserver clickObserver);

    // 移除点击事件观察者
    void removeClicker(ClickObserver clickObserver);
}
