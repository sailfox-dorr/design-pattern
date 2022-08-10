package com.dorr.dev.pattern.princple.behavior.iterator;

public class ConcreteIterator<T> implements Iterator<T> {
    private ConcreteAggregate concreteAggregate;

    private int index = 0;
    private int size = 0;

    public ConcreteIterator(ConcreteAggregate<T> concreteAggregate) {

        this.concreteAggregate = concreteAggregate;
        size = concreteAggregate.size();


    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public T next() {
        if (hasNext()) return (T) concreteAggregate.getElements(index++);

        return null;
    }
}
