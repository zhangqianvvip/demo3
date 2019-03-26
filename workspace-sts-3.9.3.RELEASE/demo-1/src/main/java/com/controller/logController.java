package com.controller;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Component
public class logController {
	private static final Logger logger = LoggerFactory.getLogger(logController.class);
	@PostConstruct
	public void logSomething() {
		logger.debug("Sample Debug Message");
		logger.info("Sample Info Message");
		logger.trace("Sample trace Message");
		logger.error("Sample error Message");
		logger.warn("Sample warn Message");
	}
}
