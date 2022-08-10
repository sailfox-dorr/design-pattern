package com.dorr.dev.pattern.princple.structure.adapter;

public class Adapter extends Adaptee implements Target{

    // 适配器 将两个类互相调用
    @Override
    public void request() {
        super.specificRequest();
    }


}
