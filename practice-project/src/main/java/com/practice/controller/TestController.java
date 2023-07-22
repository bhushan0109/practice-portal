package com.practice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestMapping
@RestController
public class TestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/test")
	public String greeting() {
		LOGGER.info("testing");
		
		return "testing";

	}

}
