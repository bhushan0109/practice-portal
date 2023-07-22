package com.practice.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CustomScheduler {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomScheduler.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	//@Scheduled(fixedRateString = "#{${process.send.mail.start} * 60000}")
	public void processSendMailScheduler() throws InterruptedException {
		LOGGER.info("processSendMailScheduler() START at >>" + dateFormat.format(new Date()));
		LOGGER.info("10 sec pause");
		Thread.sleep(10000);
		LOGGER.info("Send Mail Successfully To Bhushan Patil at==>" + dateFormat.format(new Date()));
	}
	
	@Scheduled(fixedDelayString = "#{${process.bulk.send.mail.start} * 60000}")
	public void processSendBulkMailScheduler() throws InterruptedException {
		LOGGER.info("processSendBulkMailScheduler()  START at >>" + dateFormat.format(new Date()));
		LOGGER.info("10 sec pause");
		Thread.sleep(10000);
		LOGGER.info("Send Mail Successfully To Bhushan Patil at==>" + dateFormat.format(new Date()));
	}


}