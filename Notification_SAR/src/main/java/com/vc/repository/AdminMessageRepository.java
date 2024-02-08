package com.vc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vc.model.AdminMessage;

@Repository
public interface AdminMessageRepository extends JpaRepository<AdminMessage,Integer>
{

}
