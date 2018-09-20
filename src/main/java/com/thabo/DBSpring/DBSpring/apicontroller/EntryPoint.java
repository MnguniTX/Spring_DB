package com.thabo.DBSpring.DBSpring.apicontroller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thabo.DBSpring.DBSpring.UserImplementations.UserImplement;
import com.thabo.DBSpring.DBSpring.apicontroller.entity.Users;

@RestController
@RequestMapping("/thabo")
public class EntryPoint {
	
	
	
	@Autowired
	UserImplement imple;
	@Autowired
	Users us;
	
	@PutMapping("/add")
	public String save(@RequestParam String email, @RequestParam String password, 
						@RequestParam String name,  @RequestParam String surname, 
						@RequestParam String gender)
	{
		return imple.save(email, password, name, surname, gender);
	}
	
	@GetMapping("/list")
	public ArrayList<Users> list()
	{
		return imple.list();
	}
	
	@GetMapping("/search")
	public Optional<Users> search(@RequestParam int id)
	{
		return imple.search(id);
	}
	
	
}
