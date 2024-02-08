package com.vc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vc.model.Admin;
import com.vc.repository.AdminRepository;

//Business Logic for Register
@Service
public class AdminService
{
	@Autowired
	AdminRepository adminRepo;

	public Admin register(Admin admin)
	{
		boolean existValue = adminRepo.existsById(admin.getId());
		if (existValue == false)
		{
			Admin a=adminRepo.save(admin);
		}
		return null;
	}
}
