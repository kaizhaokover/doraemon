package com.github.kzk.doraemon.module.message.common;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * @author: zhaokai
 * @create: 2019-06-21 14:55:07
 */
public class KafkaApplication {


    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.26.121:9092,192.168.26.122:9092,192.168.26.123:9092");
        props.put("acks", "all");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");


        Producer<String, String> producer = new KafkaProducer<>(props);
        for (int i = 0; i < 100; i++)
            producer.send(new ProducerRecord<String, String>("test", Integer.toString(i), Integer.toString(i)));

        producer.close();
    }

}
