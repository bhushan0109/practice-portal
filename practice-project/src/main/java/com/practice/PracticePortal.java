package com.practice;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PracticePortal extends SpringBootServletInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(PracticePortal.class);

	public static void main(String[] args) {
		// set spring.config.location here if we want to run the application as a jar
		new SpringApplicationBuilder(PracticePortal.class).sources(PracticePortal.class).properties(getProperties())
				.run(args);
		LOGGER.info("##### PracticePortal  Successfully STARTED #####");
	}

	// set spring.config.location here if we want to deploy the application as a war
	// on tomcat then it will be @Override your application properties
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
		return springApplicationBuilder.sources(PracticePortal.class).properties(getProperties());
	}

	static Properties getProperties() {
		Properties props = new Properties();
		props.put("spring.config.location", "/data/ext-application.properties");
		return props;
	}
}