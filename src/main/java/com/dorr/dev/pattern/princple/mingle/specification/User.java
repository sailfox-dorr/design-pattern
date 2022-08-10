package com.dorr.dev.pattern.princple.mingle.specification;

//用户类
public class User {        // 姓名
    private String name;        //年龄
    private int age;        //构造函数

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //显示信息
    public void show() {
        System.out.println("用户名： " + name + "\t年龄： " + age);
    }
}