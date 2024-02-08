package com.vc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vc.model.UserRide;
import com.vc.repository.UserRideRepository;

@Service
public class UserRideService
{
	@Autowired
	UserRideRepository rideRepo;

	//To get all the  rides
	public List<UserRide> getAllRides()
	{
		return  (List<UserRide>)rideRepo.findAll();
	}

	//to add a ride
	public UserRide userRide(UserRide Ride) {
		UserRide v=rideRepo.save(Ride);
		return v;
	}

	//to remove the ride by its id
	public String cancelRideById(int id)
	{
		boolean status=rideRepo.existsById(id);
		if(status==true)
		{
			rideRepo.deleteById(id);
			return "Ride with "+id+"cancelled successfully";
		}
		else
		{
			return "Ride with "+id+"could not be cancelled";
		}
	}

}

