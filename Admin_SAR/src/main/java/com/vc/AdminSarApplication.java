package com.vc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import com.vc.repository.AdminRepository;


@SpringBootApplication
public class AdminSarApplication
{
	@Autowired
	AdminRepository adminRepository;
	
	// @PostConstruct //execute the function, init()
	// public void initUsers()
	// {
	//   List<Admin> users=Stream.of(
	//                     new Admin(101,"laya","password","LayaBoini","laya@gmail.in","45678987777","Admin"),
	//                     new Admin(102,"ram","pwd1","Ram","ram@gmail.in", "12345343346", "User"),
	//                     new Admin(103,"shyam","pwd2","Shyam","shyam@gmail.in", "1234567", "Admin")
	//   ).collect(Collectors.toList());
	//   adminRepository.saveAll(users);
	// }
	
	@Bean
	public RestTemplate getRestTemplate()
	{
	return new RestTemplate();
	}
	
	public static void main(String[] args) 
	{
	SpringApplication.run(AdminSarApplication.class, args);
	System.out.println("share a ride project is started");
	System.out.println("admin application is started");
	}
}