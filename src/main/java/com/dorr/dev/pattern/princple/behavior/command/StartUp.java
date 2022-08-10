package com.dorr.dev.pattern.princple.behavior.command;

public class StartUp implements Command{
    private Receiver receiver;

    public StartUp(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {

        this.receiver.receive(this);

    }
}
