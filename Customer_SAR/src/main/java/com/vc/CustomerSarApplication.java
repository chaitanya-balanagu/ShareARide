package com.vc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import com.vc.repository.CustomerRepository;

//main class of the customer from here only springboot applications starts

@SpringBootApplication
public class CustomerSarApplication
{
	@Autowired
	CustomerRepository cRepo;

	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerSarApplication.class, args);
		System.out.println("customer application is started");
	}
}


