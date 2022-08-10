package com.dorr.dev.pattern.princple.behavior.observer;

public class KafkaConsumer implements Subscriber {
    @Override
    public void update(String message) {
        System.out.println("KafkaConsumer 收到更新信息");
        handleMessage(message);
    }


    public void handleMessage(String message) {
        System.out.println("KafkaConsumer 收到数据： " + message + "！");

    }
}
