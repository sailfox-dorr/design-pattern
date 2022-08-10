package com.dorr.dev.pattern.princple.behavior.observer;

public class KafkaProducer {

    private KafkaTopic kafkaTopic;

    public void sendRecord(String message) {

        System.out.println("KafkaProducer send data: " + message + " !");
        // 数据给到topic
        this.kafkaTopic.setMessage(message);
        this.kafkaTopic.notifySubscriber();
    }

    public void subscribe(KafkaTopic kafkaTopic) {

        this.kafkaTopic = kafkaTopic;
    }

}
