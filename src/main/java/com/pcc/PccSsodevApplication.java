package com.pcc;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class PccSsodevApplication {

	public static void main(String[] args) {
		SpringApplication.run(PccSsodevApplication.class, args);
	}

}
