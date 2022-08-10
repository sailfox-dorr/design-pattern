package com.dorr.dev.pattern.princple.behavior.command;

public class HangUp implements Command{


    private Receiver receiver;

    public HangUp(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {

        this.receiver.receive(this);

    }
}
