package com.dorr.dev.pattern.princple.mingle.specification;

//规格接口
public interface IUserSpecification {        // 候选者是否满足要求
    public boolean isSatisfiedBy(User user);        //and操作

    public IUserSpecification and(IUserSpecification spec);        //or操作

    public IUserSpecification or(IUserSpecification spec);        //not操作

    public IUserSpecification not();
}