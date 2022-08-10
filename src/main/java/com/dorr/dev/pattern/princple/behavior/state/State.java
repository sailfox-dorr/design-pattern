package com.dorr.dev.pattern.princple.behavior.state;

public abstract class State {
    // 引入context变量
   public abstract void handle();

    public void setContext(Context context) {
        this.context = context;
    }

    private Context context;
}
