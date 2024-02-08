package com.vc.service;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import com.vc.repository.AdminRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService
{
	@Autowired
	AdminRepository adminRepository;

	@Override
	public UserDetails loadUserByUsername(String userName)
	{
		com.vc.model.Admin use=adminRepository.findByUserName(userName);

		return new org.springframework.security.core.userdetails.User(use.getUserName(),use.getPassword(),new ArrayList<>());
	}
}

