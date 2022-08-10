package com.dorr.dev.pattern.princple.mingle.specification;

public class AndSpecification extends CompositeSpecification {
    private IUserSpecification left;
    private IUserSpecification right;


    public AndSpecification(CompositeSpecification compositeSpecification, IUserSpecification spec) {
        this.left = compositeSpecification;
        this.right = spec;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) && right.isSatisfiedBy(user);
    }
}
