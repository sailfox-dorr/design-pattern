package com.dorr.dev.pattern.princple.behavior.memento;

public class MementoDemo {
    public static void main(String[] args) {

        // 备忘录模式中有三种角色
        // 发起人（Originator）角色：该角色记录当前时刻的内部状态，负责定义哪些属于备份范围的状态，负责创建和恢复备忘数据。
        // 备忘录（Memento）角色：该角色负责存储发起人角色的内部状态，在需要时提供发起人需要的内部状态数据。
        // 负责人（Caretaker）角色：该角色对备忘录角色进行管理、保存和提供备忘录

        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        // 负责人创建备忘录
        caretaker.setMemento(originator.createMemento());

        // 负责人更新备忘录状态
        originator.setState("");

        originator.restoreMemento(caretaker.getMemento());


    }
}
