package com.example.demo.Contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Applicant.Repository.ApplicantRepository;
import com.example.demo.Entity.Applicant;
 
@RestController
public class ApplicantControllers {
	@Autowired
	 ApplicantRepository applicantRepo;
//    
	@PostMapping("/addApplicantInfo")
	public  ResponseEntity<String> saveUser(@RequestBody Applicant applicant  )
	{
		 applicantRepo.save( applicant);
		ResponseEntity<Applicant> Re;
		return ResponseEntity.ok("Applicant Info ADDED");
		
	}
	@GetMapping("applicantInfo/{id}")
	public ResponseEntity<Applicant> getApplicantInfoById(@PathVariable int id)
	{
		return ResponseEntity.ok( applicantRepo.findById( id).get());
	}
}
