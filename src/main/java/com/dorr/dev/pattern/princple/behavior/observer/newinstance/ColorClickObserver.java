package com.dorr.dev.pattern.princple.behavior.observer.newinstance;

public class ColorClickObserver implements ClickObserver{
    @Override
    public void clicked(Clickable clickable) {

        // 将按钮的颜色设置为红色

        if(clickable instanceof Button){
            Button button = (Button)clickable;
            button.setColor("red");
            System.out.println("按钮颜色设置为红色 ！ ");
        }

    }
}
