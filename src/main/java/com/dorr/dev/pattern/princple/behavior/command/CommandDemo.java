package com.dorr.dev.pattern.princple.behavior.command;

public class CommandDemo {
    /**
     *
     * @param args
     *
     * 命令模式  类间结偶 可扩展性强
     * 命令模式 结合其他模式会更优秀
     *
     *
     */
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        FlinkCluster flinkCluster = new FlinkCluster();

        FlinkExecutor flinkExecutor = new FlinkExecutor();
        flinkCluster.setSuccessor(flinkExecutor);
        ExitUp exitUp = new ExitUp(flinkCluster);
        HangUp hangUp = new HangUp(flinkCluster);
        StartUp startUp = new StartUp(flinkCluster);

        // 命令模式 结合责任链模式 由flink executor来处理Ternimated类型的请求
        Terminated terminated = new Terminated(flinkCluster);

        invoker.setCommand(terminated);
        invoker.action();

        invoker.setCommand(exitUp);
        invoker.action();

    }
}
