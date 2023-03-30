package com.guitarcenter.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.guitarcenter.entities.ContainerDetails;
import com.guitarcenter.repositories.ContainerDetailsRepository;

@Service
public class ContainerDetailsServiceImpl implements ContainerDetailsService {
	
	@Autowired
	private ContainerDetailsRepository containerDetailsRepository;

	public ResponseEntity<List<ContainerDetails>> getAllContainerDetails() {

		List<ContainerDetails> containerList = new ArrayList<ContainerDetails>();
		containerDetailsRepository.findAll().forEach(container -> containerList.add(container));
		if (containerList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(containerList, HttpStatus.OK);
	}

	public ResponseEntity<ContainerDetails> getContainerDetails(String containerHeaderKey) {

		Optional<ContainerDetails> container = containerDetailsRepository.findById(containerHeaderKey);
		if (container.isPresent()) {
			return new ResponseEntity<>(container.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
