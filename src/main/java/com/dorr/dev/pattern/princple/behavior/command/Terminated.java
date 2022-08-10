package com.dorr.dev.pattern.princple.behavior.command;

public class Terminated implements Command {

    private Receiver receiver;

    public Terminated(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {

        this.receiver.receive(this);

    }
}
