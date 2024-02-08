package com.vc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vc.model.Admin;
import com.vc.model.User;
import com.vc.service.AdminService;
import com.vc.util.JwtUtil;
//admin controller file where we register,authenticate(login),logout

@RestController
@RequestMapping("/admin")
public class AdminController
{
	@Autowired
	AdminService aser;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	HttpServletRequest req;

	@Autowired
	HttpServletResponse resp;

	//To Register
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody Admin admin)
	{
		Admin x=aser.register(admin);
		return new ResponseEntity<>(x,HttpStatus.CREATED);
	}

	//Generating Token and Authenticating
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody User user) throws Exception{

		try{
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword())
					);
		}catch(Exception ex) {
			throw new Exception("invalid username/password");
		}

		return jwtUtil.generateToken(user.getUserName());
	}

	@PostMapping("/logout")
	public String logout()
	{
		HttpSession hs=req.getSession(false);
		if(hs!=null)
		{
			hs.invalidate();
			return "you have loggedout successfuly";
		}
		return null;
	}
}
