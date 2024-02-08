package com.vc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vc.model.Vehicle;
import com.vc.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController
{
	@Autowired
	VehicleService vehicleService;

	//Get all vehicles
	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping("/getAllVehicles")
	public ResponseEntity<?> getAllVehicles()
	{
		List<Vehicle> x=vehicleService.getAllVehicles();
		return new ResponseEntity<>(x,HttpStatus.OK);
	}

	//Get Vehicle by Id
	@GetMapping("/getVehicleById/{id}")
	public ResponseEntity<?>getVehicleById(@PathVariable int id)
	{
		Vehicle x=vehicleService.getVehicleById(id);
		return new ResponseEntity<>(x,HttpStatus.OK);
	}

	//Adding a vehicle
	@PostMapping("/addVehicle")
	public ResponseEntity<?> addVehicle(@RequestBody Vehicle vehicles)
	{
		Vehicle x=vehicleService.addVehicle(vehicles);
		return new ResponseEntity<>(x,HttpStatus.CREATED);
	}

	//Delete A vehicle
	@DeleteMapping("/deleteVehicle/{id}")
	public ResponseEntity<?> removeVehicleById(@PathVariable int id)
	{

		String x=vehicleService.removeVehicleById(id);
		return new ResponseEntity<>(x,HttpStatus.OK);
	}

	//Update a vehicle
	@PutMapping("/updateVehicle")
	public ResponseEntity<?> updateVehicleById(@RequestBody Vehicle newVehicle) {
		String x=vehicleService.updateVehicleById(newVehicle);
		return new ResponseEntity<>(x,HttpStatus.OK);
	}
}
