package com.dorr.dev.pattern.princple.behavior.mediator;

public class MediatorDemo {
    /**
     *
     * @param args
     * 中介模式的 婚介所配对
     * 在创建的对象的同时 由中介来维护对象之间处理的关系
     */
    public static void main(String[] args) {

        MarriageMediator mediator = new MarriageMediatorImpl();
        Man m1 = new Man("许靖", 19, new Require(17, 21, Sex.FEMALE), mediator);
        Woman w1 = new Woman("刘亦菲", 18, new Require(18, 22, Sex.MALE), mediator);
        Woman w2 = new Woman("明菜", 18, new Require(18, 22, Sex.MALE), mediator);


        Man m2 = new Man("李松春", 33, new Require(17, 21, Sex.MALE), mediator);
        Woman m3 = new Woman("郑朝阳", 18, new Require(31, 35, Sex.MALE), mediator);
        Man m4 = new Man("李约翰", 18, new Require(31, 35, Sex.MALE), mediator);
        Man m5 = new Man("麦克阿瑟", 77, new Require(31, 35, Sex.MALE), mediator);

        m1.findPartner();
        m2.findPartner();
        m5.findPartner();


    }

}
