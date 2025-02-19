package com.example.kafka.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics = "teset-topic", groupId = "my-group")
	public void listener(ConsumerRecord<String, String> record) {
		System.out.println("Received: " + record.value());
	}
}
