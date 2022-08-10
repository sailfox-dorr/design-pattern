package com.dorr.dev.pattern.princple.structure.composite.role;

import com.dorr.dev.pattern.princple.structure.composite.Composite;

public class Manager extends Composite {
    public Manager(String name, int age, Double salary) {
        super(name, age, salary);
    }


    @Override
    public void operation() {
        System.out.println("===============我是Manager=============");
        System.out.println(this);
        System.out.println("===============我是Manager=============");

        System.out.println();

    }


    @Override
    public String toString() {
        return "Manager{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", salary=" + this.getSalary() +
                ", 下属数=" + this.getSubordinates().size() +
                '}';
    }
}
