package com.dorr.dev.pattern.princple.behavior.state;

public class Context {

    //  上下文对象负责状态的管理和切换
    private final static State BACKPRESSURE = new BackPressure();
    private final static State HEALTHY = new Healthy();
    private final static State OOM = new OOM();

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void handle(String state) {
        switch (state) {
            case "healthy":
                this.currentState = HEALTHY;
                break;
            case "oom":
                this.currentState = OOM;
                break;
            case "backpressure":
                this.currentState = BACKPRESSURE;
                break;
        }
        this.currentState.handle();

    }

}
