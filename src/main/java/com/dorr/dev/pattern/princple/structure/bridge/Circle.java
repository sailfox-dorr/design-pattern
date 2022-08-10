package com.dorr.dev.pattern.princple.structure.bridge;

public class Circle extends AbstractShape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {

        System.out.println("use "+ color.getColor() + " draw circle.");
    }
}
