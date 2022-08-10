package com.dorr.dev.pattern.princple.create.factory;

public class ConcreteCreator implements Creator{
    @Override
    public <T extends Product> T factory(Class<T> c) {
        T product = null;

        try {
            product = (T)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}
