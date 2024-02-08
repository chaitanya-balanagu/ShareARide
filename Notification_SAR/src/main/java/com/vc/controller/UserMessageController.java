package com.vc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vc.model.UserMessage;
import com.vc.service.UserMessageService;

@RestController
public class UserMessageController
{
	@Autowired
	UserMessageService umser;

	@PostMapping("/userMessage")
	public ResponseEntity<?> userMessage(@RequestBody UserMessage am)
	{
		UserMessage x=umser.userMessage(am);
		return new ResponseEntity<>(x,HttpStatus.OK);
	}

	@GetMapping("/getUserMessages")
	public ResponseEntity<?> getAllUserMessages()
	{
		List<UserMessage> x=umser.getAllUserMessages();
		return new ResponseEntity<>(x,HttpStatus.OK);

	}

}