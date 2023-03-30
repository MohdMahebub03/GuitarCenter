package com.guitarcenter.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.guitarcenter.entities.ActiveLineStatus;
import com.guitarcenter.entities.ActiveLineStatusKey;
@Repository
public interface ActiveLineStatusRepository extends CassandraRepository<ActiveLineStatus,ActiveLineStatusKey>{

}
