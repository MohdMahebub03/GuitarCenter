package com.guitarcenter.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.guitarcenter.entities.ContainerDetails;

@Repository
public interface ContainerDetailsRepository extends CassandraRepository<ContainerDetails, String>{

}
