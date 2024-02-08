package com.vc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vc.model.UserRide;
import com.vc.service.UserRideService;

//booking a ride by customer,cancelling of ride by id
@RestController
@RequestMapping("/userride")
public class UserRideController
{
	@Autowired
	private UserRideService rideService;

	//Get All Rides booked by admin
	@GetMapping("/getAllRides")
	public ResponseEntity<?>  getAllRides()
	{
		List<UserRide> x=rideService.getAllRides();
		return new ResponseEntity<>(x,HttpStatus.OK);
	}

	//Booking a ride
	@PostMapping("/bookARide")
	public ResponseEntity<?> addRide(@RequestBody UserRide Ride)
	{
		UserRide x=rideService.userRide(Ride);
		return new ResponseEntity<>(x,HttpStatus.CREATED);
	}

	//Cancelling a ride
	@DeleteMapping("/cancelRideById/{id}")
	public ResponseEntity<?> removeRideById(@PathVariable int id)
	{
		String x=rideService.cancelRideById(id);
		return new ResponseEntity<>(x,HttpStatus.OK);
	}
}



