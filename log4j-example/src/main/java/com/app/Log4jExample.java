package com.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
	private static final Logger logger = LogManager.getLogger(Log4jExample.class);

	public static void main(String[] args) {
		logger.debug("Debug Message Logged !!!");
		logger.info("Info Message Logged !!!");
		logger.trace("This is trace");
		logger.warn("This is warn");
		logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
	}
}
