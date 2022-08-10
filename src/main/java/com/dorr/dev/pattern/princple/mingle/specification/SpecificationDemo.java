package com.dorr.dev.pattern.princple.mingle.specification;

import java.util.ArrayList;

public class SpecificationDemo {
    public static void main(String[] args) {
        //规格模式（Specification Pattern）是策略模式和组合模式的扩展，是一种特殊应用，实现了对象的筛选功能

        // 比较巧妙

        // 规格模式已经是一个非常具体的应用框架，它巧妙地实现了对象的筛选功能，当遇到下面所述的情况时，可以考虑使用规格模式。
        // 从多个对象中筛选查找符合不同条件的对象。
        // 业务规则不适于放在任何已有的实体或值对象中，且规则的变化和组合会掩盖领域对象的基本含义。


        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("张三", 23));
        userList.add(new User("李四", 61));
        userList.add(new User("王五", 65));
        userList.add(new User("张丽", 35));
        userList.add(new User("李鹏", 72));
        userList.add(new User("王艳", 18));
        userList.add(new User("王小二", 14));
        userList.add(new User("李张", 32));            //定义一个用户查询类


        for (User user : new UserProvider(userList)
                .findUser(new UserByNameLike("张%")
                        .and(new FilterAgeSpecification(20))
                )) {

            System.out.println(user.getName());
        }


    }
}
