package com.dorr.dev.pattern.princple.behavior.observer;

public class KafkaClientDemo {
    public static void main(String[] args) {
        /**
         * 使用发布订阅模式构建程序
         */

        KafkaTopic kafkaTopic = new KafkaTopic("dorr-topic","localhost:9092");
        kafkaTopic.attach(new KafkaConsumer());
        kafkaTopic.attach(new KafkaConsumer());


        KafkaProducer producer = new KafkaProducer();
        producer.subscribe(kafkaTopic);

        producer.sendRecord("今天股票大涨1～");
        producer.sendRecord("今天股票大涨2～");
        producer.sendRecord("今天股票大涨3～");

    }
}
