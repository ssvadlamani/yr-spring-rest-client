package com.yubraj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootWebApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootWebApplication.class);
	}

	public static void main(String[] args) throws Exception {
		logger.info("class : SpringBootWebApplication method : main BEGIN");
		SpringApplication.run(SpringBootWebApplication.class, args);
		logger.info("class : SpringBootWebApplication method : main END");
	}

}