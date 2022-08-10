package com.dorr.dev.pattern.princple.behavior.state;

public class BackPressure extends State{


    @Override
    public void handle() {
        System.out.println("检测集群出现背压，正在处理。。。");
    }
}
