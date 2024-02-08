package com.vc.service;


import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.vc.dto.UserMessage;
import com.vc.exceptions.VehicleAlreadyExistsException;
import com.vc.exceptions.VehicleIdDoesNotExistsException;
import com.vc.model.Vehicle;
import com.vc.repository.VehicleRepository;

@Service
public class VehicleService
{
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	VehicleRepository vehiclesRepo;

	//Business Logic for CRUD operations to vehicle

	public List<Vehicle> getAllVehicles()
	{
		return vehiclesRepo.findAll();
	}

	public Vehicle getVehicleById(int id)
	{
		Optional<Vehicle> v=vehiclesRepo.findById(id);
		try {
			return v.get();
		}

		catch(NoSuchElementException ex)
		{
			throw new VehicleIdDoesNotExistsException("vehicle with "+id+ " already exists");
		}
	}

	public Vehicle addVehicle(Vehicle vehicles)
	{
		boolean existValue=vehiclesRepo.existsById(vehicles.getId());
		if(existValue == false)
		{
			return vehiclesRepo.save(vehicles);
		}
		else
		{
			throw new VehicleAlreadyExistsException("Vehicle with " +vehicles.getId() + " already exists");
		}

	}

	public String removeVehicleById(int id)
	{
		boolean status=vehiclesRepo.existsById(id);
		if(status==true)
		{
			vehiclesRepo.deleteById(id);
			return "Vehicle with "+id+"deleted successfully";
		}
		else
		{
			return "Vehicle with "+id+"could not be deleted";
		}
	}

	public String updateVehicleById(Vehicle newVehicle)
	{
		Optional<Vehicle> oldVehicle=vehiclesRepo.findById(newVehicle.getId());
		try {
			System.out.println("old vehicle data:"+oldVehicle.get());
			vehiclesRepo.save(newVehicle);
			System.out.println("new vehicle data:"+newVehicle);
			return "vehicle updated succesfully";
		}
		catch(Exception e) {
			return "could not updated";
		}
	}

	public List<Vehicle> findByPrice(int price)
	{
		return vehiclesRepo.findByPrice(price);
	}

	public List<UserMessage> fetchAMsg()
	{
		String url="http://localhost:8082/getUserMessages";
		ResponseEntity<UserMessage[]> r=restTemplate.getForEntity(url, UserMessage[].class);
		return Arrays.asList(r.getBody());
	}


}
