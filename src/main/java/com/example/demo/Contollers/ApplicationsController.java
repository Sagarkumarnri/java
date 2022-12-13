package com.example.demo.Contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

}
