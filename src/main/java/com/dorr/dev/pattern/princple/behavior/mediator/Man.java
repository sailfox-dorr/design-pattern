package com.dorr.dev.pattern.princple.behavior.mediator;

public class Man extends Person {
    public Man(String name, int age, Require requestAge, MarriageMediator agency) {
        super(name, age, requestAge, agency);
        this.setSex(Sex.MALE);
    }
}
