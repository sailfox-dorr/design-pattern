package com.dorr.dev.pattern.princple.structure.proxy;

public class GamePlayer implements IGamePlayer{

    private String name;
    public GamePlayer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void killBoss() {
        System.out.println(name + " -- kill boss");
    }

    @Override
    public void upgrade() {
        System.out.println(name + " -- upgrade");
    }
}
