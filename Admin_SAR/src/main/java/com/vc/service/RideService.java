package com.vc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vc.model.Ride;
import com.vc.repository.RideRepository;

@Service
public class RideService
{
	@Autowired
	RideRepository rideRepo;

	//To get all the  rides
	public List<Ride> getAllRides()
	{
		return  (List<Ride>)rideRepo.findAll();
	}

	//to add a ride
	public Ride addRide(Ride Ride) {
		Ride v=rideRepo.save(Ride);
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