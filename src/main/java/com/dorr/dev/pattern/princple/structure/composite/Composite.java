package com.dorr.dev.pattern.princple.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee{

    private String name ;
    private int  age ;
    private Double salary ;


    private List<Employee> subordinates;

    public Composite(String name, int age, Double salary){
        this.name=name;
        this.age = age;
        this.salary = salary;
        this.subordinates = new ArrayList<>();

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

        System.out.println(      "Composite{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}');
    }



    public void add(Employee employee){
        this.subordinates.add(employee);
    }

    public void remove(Employee employee){
        this.subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }



}
