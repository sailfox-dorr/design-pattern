package com.dorr.dev.pattern.princple.behavior.command;

public class ExitUp implements Command{


    private Receiver receiver;

    public ExitUp(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {

        this.receiver.receive(this);

    }
}
