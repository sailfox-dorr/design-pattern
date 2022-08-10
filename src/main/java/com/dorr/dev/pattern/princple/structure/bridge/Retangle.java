package com.dorr.dev.pattern.princple.structure.bridge;

public class Retangle extends AbstractShape{

    public Retangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("use "+ color.getColor() + " draw retangle.");
    }
}
