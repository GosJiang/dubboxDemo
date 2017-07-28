package com.dubbox.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubbox.demo.api.UserService;


@Controller
public class DubboController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		System.out.println("##to call provider");
		return userService.hello("world");
	}
	
}
