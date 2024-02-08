package com.vc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vc.model.UserMessage;
import com.vc.repository.UserMessageRepository;

@Service
public class UserMessageService
{
	@Autowired
	UserMessageRepository umrepo;

	public  UserMessage userMessage(UserMessage msg)
	{
		return umrepo.save(msg);
	}

	public  List<UserMessage> getAllUserMessages()
	{
		return umrepo.findAll();
	}
}











