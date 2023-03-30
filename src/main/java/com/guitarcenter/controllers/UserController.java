package com.guitarcenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guitarcenter.entities.UserInfo;
import com.guitarcenter.services.UserInfoService;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping(value="/userInfo", method=RequestMethod.GET)
	public ResponseEntity<UserInfo> login(@RequestParam String userName, @RequestParam String password){
		return userInfoService.login(userName, password);
	}

}
