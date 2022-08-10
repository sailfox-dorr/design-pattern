package com.dorr.dev.pattern.princple.behavior.observer;

import java.util.Enumeration;
import java.util.Vector;

public class Topic implements Subject{

    private Vector<Subscriber> subscribers = new Vector<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    @Override
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this.message);
        }
    }


    public Enumeration<Subscriber> getSubscribers() {
        return subscribers.elements();
    }

    public void change(){
        // 业务方法
        this.notifySubscriber();

    }
}
