package com.vc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vc.model.Customer;
import com.vc.repository.CustomerRepository;

//business logic of customer
@Service
public class CustomerService
{

	@Autowired
	CustomerRepository cRepo;

	public Customer register(Customer c)
	{
		boolean existValue = cRepo.existsById(c.getId());
		if (existValue == false)
		{
			Customer a=cRepo.save(c);
		}
		return null;
	}
}