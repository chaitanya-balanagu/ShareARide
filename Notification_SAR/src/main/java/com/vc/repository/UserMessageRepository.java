package com.vc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vc.model.UserMessage;

@Repository
public interface UserMessageRepository extends JpaRepository<UserMessage,Integer>
{

}