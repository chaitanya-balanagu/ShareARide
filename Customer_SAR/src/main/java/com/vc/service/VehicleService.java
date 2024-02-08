package com.vc.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.vc.dto.AdminMessage;
import com.vc.model.Vehicle;
import com.vc.repository.VehicleRepository;

//business logic of vehicles

@Service
public class VehicleService
{
	@Autowired
	private VehicleRepository vehiclesRepo;

	@Autowired
	RestTemplate restTemplate;

	public List<Vehicle> getAllVehicles()
	{
		return vehiclesRepo.findAll();
	}

	public List<AdminMessage> fetchAMsg()
	{
		String url="http://localhost:8082/getAdminMessages";
		ResponseEntity<AdminMessage[]> r=restTemplate.getForEntity(url, AdminMessage[].class);
		return Arrays.asList(r.getBody());
	}

}