package com.vc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vc.model.UserRide;

//JPA Repository is mainly used for managing the data in a Spring Boot Application.
@Repository
public interface UserRideRepository extends JpaRepository<UserRide,Integer>
{

}
