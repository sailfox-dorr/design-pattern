package com.dorr.dev.pattern.princple.behavior.iterator;

import java.util.Vector;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private Vector<T> vector = new Vector<>();
    @Override
    public void add(T t) {

        this.vector.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(this);
    }


    public int size() {
        return vector.size();
    }

    public T getElements(int index) {
       if (index < vector.size()){
           return vector.get(index);
       }
       return null;

    }
}
