package com.guitarcenter.repositories;

import java.util.Optional;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.guitarcenter.entities.UserInfo;

public interface UserInfoRepository extends CassandraRepository<UserInfo, Integer>{

	@AllowFiltering
	@Query("SELECT * FROM users WHERE use_name =?0 AND password =?1 ALLOW FILTERING")
	public Optional<UserInfo> findUser(String usename, String password);
}
