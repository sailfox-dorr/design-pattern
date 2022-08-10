package com.dorr.dev.pattern.princple.behavior.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        ObjectStructure obs = new ObjectStructure();
        obs.add(new Element1());
        obs.add(new Element2());

        obs.action(new ConcreteVisitor());
    }
}
