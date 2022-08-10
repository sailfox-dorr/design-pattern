package com.dorr.dev.pattern.princple.behavior.state;

public class OOM extends State{
    @Override
    public void handle() {
        System.out.println("开始处理 oom， 回收对象");
    }
}
