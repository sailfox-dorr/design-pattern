package com.dorr.dev.pattern.princple.behavior.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Element1 element1) {
        element1.operation(this);
    }

    @Override
    public void visit(Element2 element2) {
        element2.operation(this);
    }
}
