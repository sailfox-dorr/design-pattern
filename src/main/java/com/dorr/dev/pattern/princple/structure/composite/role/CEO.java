package com.dorr.dev.pattern.princple.structure.composite.role;

import com.dorr.dev.pattern.princple.structure.composite.Composite;

public class CEO extends Composite {
    public CEO(String name, int age, Double salary) {
        super(name, age, salary);
    }


    @Override
    public void operation() {
        System.out.println("===============我是CEO=============");
        System.out.println(this);
        System.out.println("===============我是CEO=============");
        System.out.println();

    }


    @Override
    public String toString() {
        return "CEO{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", salary=" + this.getSalary() +
                ", 经理数=" + this.getSubordinates().size() +
                '}';
    }
}
