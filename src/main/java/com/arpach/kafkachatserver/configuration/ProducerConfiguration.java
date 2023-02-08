package com.arpach.kafkachatserver.configuration;

//import com.arpach.kafkachatserver.constants.KafkaConstants;
import com.arpach.kafkachatserver.model.Messages;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;



@EnableKafka
@Configuration

public class ProducerConfiguration{
	@Bean 
	public  ProducerFactory<String,Messages> producerFactory(){
		return new DefaultKafkaProducerFactory<>(producerConfigurations());
	
	}
	@Bean
	public Map<String,Object> producerConfigurations(){
		Map<String,Object> configurations = new HashMap<>();
		configurations.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
		configurations.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configurations.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,JsonSerializer.class);
		return configurations;
	}
		
	@Bean
	public KafkaTemplate<String,Messages>kafkaTemplate(){
		return new KafkaTemplate<>(producerFactory());
	}
		
}
		



