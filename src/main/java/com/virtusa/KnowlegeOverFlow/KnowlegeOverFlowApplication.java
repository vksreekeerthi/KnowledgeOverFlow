package com.virtusa.KnowlegeOverFlow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KnowlegeOverFlowApplication {

	public static void main(String[] args) {
		 final Logger logger = LoggerFactory.getLogger(KnowlegeOverFlowApplication.class);

		SpringApplication.run(KnowlegeOverFlowApplication.class, args);
	}

}
