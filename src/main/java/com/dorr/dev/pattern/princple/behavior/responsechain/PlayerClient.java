package com.dorr.dev.pattern.princple.behavior.responsechain;

public class PlayerClient {

    /**
     *
     * @param args
     *
     * 责任链模式   通过在具体的handler中明确责任的划分  确定不同的处理的对象
     *
     * 处理的场景：
     * ■ 一个请求需要一系列的处理工作。
     * ■ 业务流的处理，例如，文件审批。
     * ■ 对系统进行补充扩展。
     */
    public static void main(String[] args) {

        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        Player3 player3 = new Player3();
        Player4 player4 = new Player4();


        player1.setSuccessor(player2);
        player2.setSuccessor(player3);
        player3.setSuccessor(player4);

        player1.handleRequest(4);

    }
}
