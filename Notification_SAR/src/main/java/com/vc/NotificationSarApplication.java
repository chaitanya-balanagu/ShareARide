package com.vc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//main class of the customer from here only springboot applications starts
@SpringBootApplication
public class NotificationSarApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationSarApplication.class, args);
		System.out.println("message notification project has started");
	}

}
