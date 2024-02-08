package com.vc.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import com.vc.repository.CustomerRepository;

//for authentication getting username and password in login

@Service
public class CustomUserDetailsService implements UserDetailsService
{
	@Autowired
	CustomerRepository cRepository;

	@Override
	public UserDetails loadUserByUsername(String userName)
	{
		com.vc.model.Customer use=cRepository.findByUserName(userName);

		return new org.springframework.security.core.userdetails.User(use.getUserName(),use.getPassword(),new ArrayList<>());
	}
}