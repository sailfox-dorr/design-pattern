package com.dorr.dev.pattern.princple.behavior.visitor.newinstance;

public class HDUser1593 implements ComputerVisitor {
    @Override
    public void visit(Cpu cpu) {
        cpu.run();
    }

    @Override
    public void visit(Gpu gpu) {

        gpu.run();
    }

    @Override
    public void visit(Disk disk) {

        disk.run();
    }
}
