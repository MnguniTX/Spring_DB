package com.thabo.DBSpring.DBSpring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thabo.DBSpring.DBSpring.apicontroller.entity.Users;


@Service
@Transactional
@Component
public interface services extends CrudRepository<Users, Integer> {
	//Performing CRUD Services

}
