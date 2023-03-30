package com.guitarcenter.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.guitarcenter.entities.ContainerDetails;



public interface ContainerDetailsService {
	
	public ResponseEntity<List<ContainerDetails>>  getAllContainerDetails();
	
	public ResponseEntity<ContainerDetails> getContainerDetails(String containerHeaderKey);
	

}
