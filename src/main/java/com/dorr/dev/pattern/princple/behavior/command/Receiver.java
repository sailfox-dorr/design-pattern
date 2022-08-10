package com.dorr.dev.pattern.princple.behavior.command;

public abstract class  Receiver {

     private Receiver successor;

     public Receiver getSuccessor() {
          return successor;
     }

     public void setSuccessor(Receiver successor) {
          this.successor = successor;
     }

     public abstract void receive(Command command);
}
