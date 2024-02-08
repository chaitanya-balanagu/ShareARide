package com.vc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vc.model.AdminMessage;
import com.vc.service.AdminMessageService;

@RestController
public class AdminMessageController
{
	@Autowired
	AdminMessageService amser;

	@PostMapping("/adminMessage")
	public ResponseEntity<?> adminMessage(@RequestBody AdminMessage am)
	{
		AdminMessage x=amser.adminMessage(am);
		return new ResponseEntity<>(x,HttpStatus.OK);
	}

	@GetMapping("/getAdminMessages")
	public ResponseEntity<?> getAllAdminMessages()
	{
		List<AdminMessage> x=amser.getAllAdminMessages();
		return new ResponseEntity<>(x,HttpStatus.OK);

	}

}