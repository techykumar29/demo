package com.ehcache.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Application is being strated");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Application is started successfully");
	}

}
