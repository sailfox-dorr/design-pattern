package com.dorr.dev.pattern.princple.behavior.visitor.newinstance;

public class Cpu extends HardWare{
    @Override
    void run() {

        System.out.println("Cpu is running ! ");
    }

    @Override
    void accept(ComputerVisitor computerVisitor) {

        computerVisitor.visit(this);

    }
}
