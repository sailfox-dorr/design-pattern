package com.dorr.dev.pattern.princple.behavior.mediator;

public class Woman extends Person {
    public Woman(String name, int age, Require requestAge, MarriageMediator agency) {
        super(name, age, requestAge, agency);
        this.setSex(Sex.FEMALE);
    }
}
