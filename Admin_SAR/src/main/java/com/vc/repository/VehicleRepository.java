package com.vc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vc.model.Vehicle;

//JPA Repository is mainly used for managing the data in a Spring Boot Applicatio

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer>
{

public List<Vehicle> findByPrice(int price);

}

