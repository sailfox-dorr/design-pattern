package com.dorr.dev.pattern.princple.behavior.command;

public class FlinkExecutor extends Receiver{
    @Override
    public void receive(Command command) {
        if (command instanceof Terminated){

            System.out.println("flink executor ternimated unexpectedly");

        }else {

            System.out.println("can not handle this kind of command");

        }
    }
}
