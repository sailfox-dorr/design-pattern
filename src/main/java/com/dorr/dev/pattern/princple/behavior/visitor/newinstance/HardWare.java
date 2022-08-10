package com.dorr.dev.pattern.princple.behavior.visitor.newinstance;

public abstract class HardWare {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    abstract void run();


    abstract void accept(ComputerVisitor computerVisitor);
}
