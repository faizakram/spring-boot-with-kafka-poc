package com.spring.boot.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
@EnableKafka
@SpringBootApplication
public class SpringBootWithKafkaPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithKafkaPocApplication.class, args);
	}

}
