package com.dorr.dev.pattern.princple.behavior.mediator;

public class Require {
    /**
     * 对找对象的要求
     */
    int belowAge;
    int upperAge;
    Sex sex;

    public Require(int belowAge, int upperAge, Sex sex) {
        this.belowAge = belowAge;
        this.upperAge = upperAge;
        this.sex = sex;
    }
}
