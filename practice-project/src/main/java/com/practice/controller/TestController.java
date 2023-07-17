package com.practice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestMapping
@RestController
public class TestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	@Value("${my.custom.variable.name}")
	public String my_name;

	@Value("${my.custom.env.name}")
	public String env_name;

	@GetMapping("/test")
	public String greeting() {
		LOGGER.info("testing");

		String name = "\n My name is " + my_name + " \nload environment is " + env_name;

		LOGGER.info(name);
		return name;

	}

}
