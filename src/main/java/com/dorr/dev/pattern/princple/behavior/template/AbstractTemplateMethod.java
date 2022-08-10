package com.dorr.dev.pattern.princple.behavior.template;

public abstract class AbstractTemplateMethod {


    abstract void operation();

    public void templateMethod() {
        System.out.println("========= start operation ========");
        this.operation();
        System.out.println("========= end operation ========");

    }

}
