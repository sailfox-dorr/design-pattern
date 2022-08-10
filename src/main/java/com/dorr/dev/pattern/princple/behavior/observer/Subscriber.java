package com.dorr.dev.pattern.princple.behavior.observer;

public interface Subscriber {
    // 收到新消息 更新方法
    public void update(String message);
}
