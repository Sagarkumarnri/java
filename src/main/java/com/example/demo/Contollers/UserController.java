package com.example.demo.Contollers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.Entity.Users;
import com.example.demo.User.Repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	@PostMapping("/signup")
	public ResponseEntity<String >signup(@RequestBody Users user)
	{
		userRepository.save( user);
		return ResponseEntity.ok( "User added");
	}
	@SuppressWarnings("deprecation")
	@GetMapping("/getUserById/{id}")
	public ResponseEntity<Users> getUserById(@PathVariable int id)
	{
		return ResponseEntity.ok(userRepository.findById( id).get()) ;
	}
	@PostMapping("/login")
	public ResponseEntity login(@RequestBody HashMap<String,String> userdata)
	{
		Users user=userRepository.findByEmailAndPassword( userdata.get( "email"), userdata.get( "password"));
		if(user!=null)
			return ResponseEntity.ok( user);
		else
			throw new ResponseStatusException(
					  HttpStatus.NOT_FOUND, "entity not found"
					);
	}

}
