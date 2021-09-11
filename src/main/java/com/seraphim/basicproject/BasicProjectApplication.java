package com.seraphim.basicproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan
@ComponentScan
public class BasicProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicProjectApplication.class, args);
	}

}
