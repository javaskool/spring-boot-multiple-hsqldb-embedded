package com.javaskool.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.javaskool.model.user.UserDetails;

public interface UserDao extends CrudRepository<UserDetails, Long> {
	
	UserDetails findByEmail(String email);
	
}
