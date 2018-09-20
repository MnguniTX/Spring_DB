package com.thabo.DBSpring.DBSpring.UserImplementations;

import java.util.ArrayList;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thabo.DBSpring.DBSpring.UserInterfs.UInterf;
import com.thabo.DBSpring.DBSpring.apicontroller.entity.Users;
import com.thabo.DBSpring.DBSpring.dao.services;
import com.thabo.DBSpring.DBSpring.decrypt.passDecrypt;
import com.thabo.DBSpring.DBSpring.encrypt.passEncrypt;


@Component
public class UserImplement implements UInterf {
	
	@Autowired
	services ser;
	@Autowired
	Users us;
	@Autowired
	passEncrypt enry;
	@Autowired
	passDecrypt decry;

	@Override
	public String save(String email, String password, String name, String surname, String gender) {
		// TODO Auto-generated method stub
		String det = "User Successfully Added\n";
		
		
		us.setEmail(email);
		us.setPassword(enry.encryptText(password));
		us.setName(name);
		us.setSurname(surname);
		us.setGender(gender);
	
		
		
		return det + ser.save(us);
	}

	@Override
	public ArrayList<Users> list() {
		// TODO Auto-generated method stub
		
		ArrayList<Users> arrList = new ArrayList<>();
		arrList= (ArrayList<Users>) ser.findAll();
		return arrList;
	}

	@Override
	public Optional<Users> search(int id) {
		// TODO Auto-generated method stub
		
		Optional<Users> opt = ser.findById(id);
		return opt;
	}

	
	
	
	
	

}
