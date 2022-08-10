package com.dorr.dev.pattern.princple.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class MarriageMediatorImpl implements MarriageMediator {
    private List<Person> people = new ArrayList<>();

    @Override
    public void pair(Person person) {

        int cnt= 0 ;
        for (Person person1 : people) {
            if (fitsRequire(person, person1)) {
                System.out.println("尊敬的用户: " + person.name + "您与" + person1.name + "配对成功！祝百年好合，白头到老！");
                cnt ++;
            }
        }

        if (cnt >0 ){
            System.out.println("尊敬的用户: " + person.name+" 共为您匹配了" + cnt +"位对象！");
        }else {
            System.out.println("尊敬的用户: " + person.name+" 抱歉未能为你匹配到合适的对象。");
        }
        System.out.println();
    }

    @Override
    public void register(Person person) {
        people.add(person);
    }


    // 匹配逻辑
    public boolean fitsRequire(Person person1, Person person2) {
            if (person1.sex == person2.require.sex
                && person1.require.sex == person2.sex
                && person1.age >= person2.require.belowAge
                && person1.age <= person2.require.upperAge
                && person2.age >= person1.require.belowAge
                && person2.age <= person1.require.upperAge) {
            return true;
        }
        return false;

    }


}
