package com.dorr.dev.pattern.princple.behavior.mediator;

public abstract class Person {
    String name; // 姓名
    int age; // 年龄
    Sex sex; // 性别
    Require require; // 要求对象的年龄。对对象只有这一个要求
    MarriageMediator agency; // 婚姻中介

    public Person(String name, int age,  Require require, MarriageMediator agency) {
        this.name = name;
        this.age = age;
        this.require = require;
        this.agency = agency;
        agency.register(this); // 注册会员
    }        // 寻找对象

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void findPartner() {
        agency.pair(this);
    }
}


