package com.vc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vc.dto.AdminMessage;
import com.vc.model.Vehicle;
import com.vc.service.VehicleService;

//getting all the available vehicles by customer,getting messages of the admin

@RestController
@RequestMapping("/vehicle")
public class VehicleController
{
	@Autowired
	VehicleService vehicleService;

	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping("/getAllVehicles")
	public ResponseEntity<?> getAllVehicles(){
		List<Vehicle> x=vehicleService.getAllVehicles();
		return new ResponseEntity<>(x,HttpStatus.OK);
	}

	@GetMapping("/getAdminmsgs")
	public List<AdminMessage> fetchAMsg()
	{
		return vehicleService.fetchAMsg();
	}
}