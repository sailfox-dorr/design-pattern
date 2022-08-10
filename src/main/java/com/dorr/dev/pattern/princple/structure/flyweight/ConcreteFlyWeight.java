package com.dorr.dev.pattern.princple.structure.flyweight;

public class ConcreteFlyWeight implements FlyWeight {

    private String inSts;

    public ConcreteFlyWeight(String inSts) {
        this.inSts = inSts;

    }

    @Override
    public void operation(String etSts) {
        System.out.println("内部状态: " + inSts + " 外部状态: " + etSts);
    }
}
