package com.guitarcenter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guitarcenter.entities.ContainerDetails;
import com.guitarcenter.services.ContainerDetailsService;

@RestController
@CrossOrigin("*")
public class ContainerDetailsController {
	
	@Autowired 
	private ContainerDetailsService containerDetailsService;
	
	@RequestMapping(value="/getAllContainerDetails", method = RequestMethod.GET)
	public ResponseEntity<List<ContainerDetails>>  getAllContainerDetails(){		
		return containerDetailsService.getAllContainerDetails();
	}
	
	@RequestMapping(value="/getContainerDetails", method = RequestMethod.GET)
	public ResponseEntity<ContainerDetails> getContainerDetails(@RequestParam String containerHeaderKey) {
		return containerDetailsService.getContainerDetails(containerHeaderKey);
	}
}
