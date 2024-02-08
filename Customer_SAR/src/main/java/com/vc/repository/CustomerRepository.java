package com.vc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vc.model.Customer;

@Repository
//JPA Repository is mainly used for managing the data in a Spring Boot Applicatio
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	Customer findByUserName(String userName);
}