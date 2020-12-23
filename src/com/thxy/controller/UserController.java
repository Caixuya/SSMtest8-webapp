package com.thxy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thxy.pojo.User;
import com.thxy.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/register")
	public String go(){	
			return "register";
	}
	
	@RequestMapping("/doregister.html")
	public String register(String username,String password) throws Exception {
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		System.out.println("username:"+username+",password:"+password);
		if("".equals(username) ||"".equals(password)) {
			
		}else {
			userService.register(user);
			return "registerSuccess";
			
		}
		return "register";
	}
}
