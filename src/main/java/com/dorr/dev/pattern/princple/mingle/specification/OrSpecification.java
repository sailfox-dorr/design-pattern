package com.dorr.dev.pattern.princple.mingle.specification;

public class OrSpecification extends CompositeSpecification {
    public OrSpecification(CompositeSpecification compositeSpecification, IUserSpecification spec) {
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return false;
    }
}
