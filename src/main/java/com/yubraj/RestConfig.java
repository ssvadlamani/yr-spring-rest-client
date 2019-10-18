package com.yubraj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {
	private static final Logger logger = LoggerFactory.getLogger(RestConfig.class);
	
	@Bean
	public RestTemplate restTemplate() {
		logger.info("class : RestConfig method : restTemplate  ======>");
	    return new RestTemplate();
	}
}
