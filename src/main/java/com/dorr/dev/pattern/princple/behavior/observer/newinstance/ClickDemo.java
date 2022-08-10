package com.dorr.dev.pattern.princple.behavior.observer.newinstance;

public class ClickDemo {
    public static void main(String[] args) {
        Button button = new Button();

        ColorClickObserver colorClickObserver = new ColorClickObserver();
        CoordinateClickObserver coordinateClickObserver = new CoordinateClickObserver();

        button.addClicker(colorClickObserver);
        button.addClicker(coordinateClickObserver);


        button.click();

        System.out.println(button.getCoordinate().getX());

    }
}
