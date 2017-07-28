package com.dubbox.demo.provider.impl;

import org.springframework.stereotype.Service;

import com.dubbox.demo.api.UserService;

@Service
public class UserServiceImpl implements UserService {

	public String hello(String name) {
		String result="##hello "+name+" this is dubbo provider";
		System.out.println(result);
		return result;
	}

}
