package com.dorr.dev.pattern.princple.behavior.visitor.newinstance;

public interface ComputerVisitor {

    void visit(Cpu cpu);
    void visit(Gpu gpu);
    void visit(Disk disk);

}
