package com.vc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vc.model.AdminMessage;
import com.vc.repository.AdminMessageRepository;

@Service
public class AdminMessageService
{
	@Autowired
	AdminMessageRepository amrepo;

	public  AdminMessage adminMessage(AdminMessage msg)
	{
		return amrepo.save(msg);
	}

	public List<AdminMessage> getAllAdminMessages()
	{
		return amrepo.findAll();
	}
}