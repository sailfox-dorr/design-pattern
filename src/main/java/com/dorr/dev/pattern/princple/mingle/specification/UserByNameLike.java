package com.dorr.dev.pattern.princple.mingle.specification;

//like规格书
public class UserByNameLike extends CompositeSpecification {        //like的标记
    private static String LIKE = "%";        //基准的
    private String likeStr;        //构造函数

    public UserByNameLike(String name) {
        this.likeStr = name;
    }        // 实现检验方法

    public boolean isSatisfiedBy(User user) {
        boolean result = false;
        String name = user.getName();            //去掉
        String str = likeStr.replace("%", "");
        if (likeStr.startsWith(LIKE) && likeStr.endsWith(LIKE)) {                //类似于             result=name.contains(str);            }else if(likeStr.startsWith(LIKE)){                //类似于
            result = name.endsWith(str);
        } else {                //类似于
            result = name.startsWith(str);
        }
        return result;
    }
}