package com.dorr.dev.pattern.princple.behavior.observer.newinstance;

import java.awt.geom.Point2D;

public class CoordinateClickObserver implements ClickObserver {
    @Override
    public void clicked(Clickable clickable) {
        if(clickable instanceof Button){
            Button button = (Button)clickable;
            button.setCoordinate(new Point2D() {
                @Override
                public double getX() {
                    return 100;
                }

                @Override
                public double getY() {
                    return 200;
                }

                @Override
                public void setLocation(double x, double y) {

                }
            });

            System.out.println("设置坐标 ！");
        }
    }
}
