package com.dorr.dev.pattern.princple.structure.decorator;

public abstract class Decorator implements Component {
    private Component component ;


    public Decorator(Component component){
        this.component = component;
    }


    @Override
    public void operation() {
        this.component.operation();
    }
}
