package com.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ServerPortService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServerPortService.class);
	private int port;

	public int getPort() {
		return port;
	}

	@EventListener
	public void onApplicationEvent(final ServletWebServerInitializedEvent event) {
		port = event.getWebServer().getPort();
		LOGGER.info("Application Running Port Is==>" + port);
	}

}
