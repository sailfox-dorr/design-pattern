package com.dorr.dev.pattern.princple.mingle.specification;

public class NotSpecification extends CompositeSpecification {
    public NotSpecification(CompositeSpecification compositeSpecification) {
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return false;
    }
}
