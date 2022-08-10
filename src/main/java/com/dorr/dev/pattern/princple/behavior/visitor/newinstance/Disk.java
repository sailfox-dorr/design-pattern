package com.dorr.dev.pattern.princple.behavior.visitor.newinstance;

public class Disk extends HardWare{

    @Override
    void run() {
        System.out.println("Disk is running !");
    }

    @Override
    void accept(ComputerVisitor computerVisitor) {
        computerVisitor.visit(this);
    }
}
