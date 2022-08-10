package com.dorr.dev.pattern.princple.behavior.memento;

public class Caretaker {
    // 负责人角色
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}


