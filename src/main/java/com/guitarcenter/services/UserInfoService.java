package com.guitarcenter.services;

import org.springframework.http.ResponseEntity;

import com.guitarcenter.entities.UserInfo;

public interface UserInfoService {
	
	public ResponseEntity<UserInfo> login(String userName,String password);
}
