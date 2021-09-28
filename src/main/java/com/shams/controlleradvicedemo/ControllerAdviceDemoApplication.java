package com.shams.controlleradvicedemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControllerAdviceDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ControllerAdviceDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Just started..");
	}
}
