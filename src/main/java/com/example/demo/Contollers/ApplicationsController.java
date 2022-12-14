package com.example.demo.Contollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Applicant.Repository.ApplicationsRepository;
import com.example.demo.Entity.Applications;

@RestController
public class ApplicationsController {
	@Autowired
	ApplicationsRepository applicationRepository;
	@PostMapping("/application/addNewApplication")
	public ResponseEntity<String>  addApplication(@RequestBody Applications application)
	{
		applicationRepository.save(application);
		return ResponseEntity.ok( "applications Submitted SuccessFully");
		
	}
	@GetMapping("/getApplicationInfo/{id}")
	public ResponseEntity<Applications>getApplicationInfoById(@PathVariable int id)
	{
		return ResponseEntity.ok( applicationRepository.findById( id).get());
	}
	@GetMapping("/getAllApplication")
	public ResponseEntity<List<Applications>> getAllApplications()
	{
		return ResponseEntity.ok( applicationRepository.findAll());
	}
	

}
