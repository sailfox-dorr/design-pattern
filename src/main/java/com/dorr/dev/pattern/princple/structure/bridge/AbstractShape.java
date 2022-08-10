package com.dorr.dev.pattern.princple.structure.bridge;

public abstract class AbstractShape {
    Color color;

    public AbstractShape(Color color){

        this.color = color;
    }
    public abstract void draw();
}
