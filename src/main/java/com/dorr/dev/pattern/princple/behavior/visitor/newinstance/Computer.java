package com.dorr.dev.pattern.princple.behavior.visitor.newinstance;


import java.util.Vector;

public class Computer {
    private Vector<HardWare> hardWares = new Vector<>();


    public Computer add(HardWare hardWare){

        hardWares.add(hardWare);
        return this;

    }

    public void visitedBy(ComputerVisitor computerVisitor){
        for (HardWare hardWare : hardWares) {
            // 所有的硬件在此处都由访问者访问
            // 此结构体在此处实现了管理硬件的作用
            hardWare.accept(computerVisitor);
        }

    }}
