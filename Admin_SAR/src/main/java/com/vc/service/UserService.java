package com.vc.service;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vc.model.Vehicle;
import com.vc.model.Admin;
import com.vc.repository.AdminRepository;
import com.vc.repository.VehicleRepository;

@Service
public class UserService
{
	@Autowired
	AdminRepository adminRepo;

	@Autowired
	HttpServletRequest request;

	@Autowired
	HttpServletResponse response;

	@Autowired
	private VehicleRepository vehicleRepo;

	public Admin registerUser(Admin user)
	{
		return adminRepo.save(user);
	}
	public List<Admin> getAllUser()
	{
		return adminRepo.findAll();
	}

	public List<Vehicle> getAllVehicles()
	{
		return vehicleRepo.findAll();
	}

}
