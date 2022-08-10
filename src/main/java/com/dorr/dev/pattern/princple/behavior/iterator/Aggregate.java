package com.dorr.dev.pattern.princple.behavior.iterator;

public interface Aggregate<T> {

    public void add(T t);

    public Iterator<T> iterator();

}
