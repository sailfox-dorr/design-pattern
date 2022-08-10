package com.dorr.dev.pattern.princple.structure.decorator;

public class Subsystem implements Component{
    @Override
    public void operation() {
        System.out.println("开始处理你的考勤异常");
    }
}
