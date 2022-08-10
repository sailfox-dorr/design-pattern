package com.dorr.dev.pattern.princple.structure.proxy;

public class IGamePlayerProxy implements IGamePlayer{
    private IGamePlayer iGamePlayer;
    private int count = 0;


    public IGamePlayerProxy(IGamePlayer iGamePlayer){
        this.iGamePlayer = iGamePlayer;

    }

    private void log(){
        System.out.println("=====================================");
        System.out.println("时间是: " + System.currentTimeMillis());
        System.out.println();
    }

    @Override
    public void killBoss() {
        log();
        iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        log();
        iGamePlayer.upgrade();
        System.out.println("升级次数" + ++count);
    }
}
