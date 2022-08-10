package com.dorr.dev.pattern.princple.behavior.observer.newinstance;

import java.awt.geom.Point2D;
import java.util.Vector;

public class Button implements Clickable{
    private Vector<ClickObserver> clickObservers = new Vector<>();

    private String color;
    private Point2D coordinate;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point2D getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Point2D coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public void click() {

        System.out.println("按钮方法被点击！ ");
        for (ClickObserver clickObserver : clickObservers) {
            clickObserver.clicked(this);
        }
    }

    @Override
    public void addClicker(ClickObserver clickObserver) {

        clickObservers.add(clickObserver);
    }

    @Override
    public void removeClicker(ClickObserver clickObserver) {

        clickObservers.remove(clickObserver);
    }
}
