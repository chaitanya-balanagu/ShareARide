package com.vc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vc.model.Admin;

//JPA Repository is mainly used for managing the data in a Spring Boot Application

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>
{
	Admin findByUserName(String userName);
}

