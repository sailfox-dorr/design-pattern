package com.dorr.dev.pattern.princple.mingle.specification;

public abstract class CompositeSpecification implements IUserSpecification {        // 候选者是否满足要求
    public abstract boolean isSatisfiedBy(User user);        //and操作

    public IUserSpecification and(IUserSpecification spec) {
        return new AndSpecification(this, spec);
    }        //or操作

    public IUserSpecification or(IUserSpecification spec) {
        return new OrSpecification(this, spec);
    }        //not操作

    public IUserSpecification not() {
        return new NotSpecification(this);
    }
}