package com.dorr.dev.pattern.princple.structure.composite.role;

import com.dorr.dev.pattern.princple.structure.composite.Employee;


public class Oridinate implements Employee {
    private String name ;
    private int  age ;
    private Double salary ;


    public Oridinate(String name, int age, Double salary){
        this.name=name;
        this.age = age;
        this.salary = salary;

    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public Double getSalary() {
        return this.salary;
    }

    @Override
    public void operation() {
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "Oridinate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
