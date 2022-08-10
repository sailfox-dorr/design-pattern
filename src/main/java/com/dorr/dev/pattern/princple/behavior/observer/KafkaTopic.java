package com.dorr.dev.pattern.princple.behavior.observer;

public class KafkaTopic extends Topic {
    private String name;
    private String bootStrapServer;


    public KafkaTopic(String name, String bootStrapServer) {
        this.name = name;
        this.bootStrapServer = bootStrapServer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBootStrapServer() {
        return bootStrapServer;
    }

    public void setBootStrapServer(String bootStrapServer) {
        this.bootStrapServer = bootStrapServer;
    }
}

