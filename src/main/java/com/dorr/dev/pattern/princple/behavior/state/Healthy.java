package com.dorr.dev.pattern.princple.behavior.state;

public class Healthy extends State{

    @Override
    public void handle() {
        System.out.println("集群健康 ！");
    }
}
