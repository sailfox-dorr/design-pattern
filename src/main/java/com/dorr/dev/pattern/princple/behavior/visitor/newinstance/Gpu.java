package com.dorr.dev.pattern.princple.behavior.visitor.newinstance;

public class Gpu extends HardWare{
    @Override
    void run() {

        System.out.println("Gpu is running ~ ");
    }

    @Override
    void accept(ComputerVisitor computerVisitor) {
        computerVisitor.visit(this);
    }
}
