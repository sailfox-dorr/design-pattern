package com.dorr.dev.pattern.princple.behavior.responsechain;

import com.dorr.dev.pattern.utils.CommonUtils;

public class Player2 extends Player {

    @Override
    public void handleRequest(int i) {
        if (i == 2){
            System.out.println(CommonUtils.getClassName(this) + " 喝酒 ！ ");
        }else if (getSuccessor() != null){
            System.out.println(CommonUtils.getClassName(this) +" passed this task to " + CommonUtils.getClassName(getSuccessor()));
            getSuccessor().handleRequest(i);
        }
        else {
            System.out.println("游戏结束");
        }
    }
}
