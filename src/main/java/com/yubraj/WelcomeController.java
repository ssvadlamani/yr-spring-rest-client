package com.yubraj;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class WelcomeController {
	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		logger.info("class : WelcomeController method : welcome  BEGIN");
		
		model.put("message", this.message);
		String s = restTemplate.getForObject("http://localhost:8080/employees/",String.class);
		System.out.println("s======================>  "+s);
		model.put("response", s);
		logger.info("class : WelcomeController method : welcome  END");
		return "welcome";
	}

}