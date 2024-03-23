package com.rahul.bookpublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BookPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookPublisherApplication.class, args);
	}

}
