package com.vc.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vc.dto.UserMessage;
import com.vc.service.VehicleService;

@RestController
public class UserMessageController
{
@Autowired
VehicleService vser;

//Fetching messages from user
@CrossOrigin(origins="http://localhost:3000")
@GetMapping("/getUsermsgs")
public List<UserMessage> fetchAMsg()
{
return vser.fetchAMsg();
}
}
