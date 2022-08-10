package com.dorr.dev.pattern.princple.behavior.memento;

public class Originator {
    // 该角色记录当前时刻的内部状态，负责定义哪些属于备份范围的状态，负责创建和恢复备忘数据。

    private String state = "Init state";

    // 创建备忘录
    public Memento createMemento(){

        return new Memento(this.state);

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void restoreMemento(Memento memento){
        this.setState(memento.getState());

    }}
