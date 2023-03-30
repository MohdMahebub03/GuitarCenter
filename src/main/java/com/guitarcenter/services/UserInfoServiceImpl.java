package com.guitarcenter.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.guitarcenter.entities.UserInfo;
import com.guitarcenter.repositories.UserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	public ResponseEntity<UserInfo> login(String userName,String password){
		Optional<UserInfo> user = userInfoRepository.findUser(userName, password);
		if(user.isPresent()) {
			return new ResponseEntity<>(user.get(), HttpStatus.OK);	
		}else {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
