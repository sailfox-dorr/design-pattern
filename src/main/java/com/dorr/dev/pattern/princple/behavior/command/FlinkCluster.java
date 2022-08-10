package com.dorr.dev.pattern.princple.behavior.command;

public class FlinkCluster extends Receiver{

    @Override
    public void receive(Command command) {
        if (command instanceof ExitUp){
            System.out.println("flink cluster exit up ");

        }
        else  if (command instanceof StartUp){
            System.out.println("flink cluster start up ");

        }else if (command instanceof HangUp){

            System.out.println("flink cluster hang up ");
        }
        else {
            getSuccessor().receive(command);
        }
    }
}
