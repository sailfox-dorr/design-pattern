package com.dorr.dev.pattern.princple.mingle.specification;

public class FilterAgeSpecification extends CompositeSpecification {


    private int age;        //构造函数

    public FilterAgeSpecification(int age) {
        this.age = age;
    }        // 实现检验方法

    public boolean isSatisfiedBy(User user) {
        return user.getAge() > age;
    }
}
