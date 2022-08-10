package com.dorr.dev.pattern.princple.behavior.responsechain;

public abstract class Player {

    private Player successor;

    public abstract void handleRequest(int i );

    public Player getSuccessor() {
        return successor;
    }

    public void setSuccessor(Player successor) {
        this.successor = successor;
    }
}
