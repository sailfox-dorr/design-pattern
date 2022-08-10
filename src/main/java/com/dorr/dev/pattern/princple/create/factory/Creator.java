package com.dorr.dev.pattern.princple.create.factory;

public interface Creator {

    public <T extends Product> T factory(Class<T> c);

}



