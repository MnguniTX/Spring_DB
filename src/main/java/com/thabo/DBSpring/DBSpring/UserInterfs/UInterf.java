package com.thabo.DBSpring.DBSpring.UserInterfs;

import java.util.ArrayList;
import java.util.Optional;

import com.thabo.DBSpring.DBSpring.apicontroller.entity.Users;

public interface UInterf {
	
	public String save(String email, String password, String name, String surname, String gender);
	public ArrayList<Users> list();
	public Optional<Users> search(int id);
	

}
