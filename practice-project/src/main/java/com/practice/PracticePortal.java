package com.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


//Before adding any scheduled jobs we need to enable scheduling explicitly by adding the @enableScheduling annotation:
@EnableScheduling
@SpringBootApplication
public class PracticePortal {
	private static final Logger LOGGER = LoggerFactory.getLogger(PracticePortal.class);

	public static void main(String[] args) {
		SpringApplication.run(PracticePortal.class, args);
	}
}