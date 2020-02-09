package com.javagal.techie.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJeninksApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJeninksApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started....");
	}

	public static void main(String[] args) {
		logger.info("Application Executed....");
		logger.info("Added Build PipeLine plug in ............Application Executed....");
		
		SpringApplication.run(SpringJeninksApplication.class, args);
	}

}
