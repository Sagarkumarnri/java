package com.example.demo.Contollers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Applicant.Repository.ApplicationsRepository;
import com.example.demo.Entity.Applications;
import com.example.demo.POJO.ApplicationsList;

@RestController
@CrossOrigin
public class ApplicationsController {
	@Autowired
	private RestTemplate restTemplate;
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
	public List<Applications> getAllApplications()
	{
		//CurrencyDTO[] forObject = new ObjectMapper.readValue(restTemplate.getForEntity("http://api.nbp.pl/api/exchangerates/tables/a/", CurrencyDTO[].class).getBody() , new TypeReference<List<CurrencyDTO>>() {}).get(0);
		List applicationList=new ArrayList<Applications> (Arrays.asList( this.restTemplate.getForEntity( "http://ApplicationService/applications/getAllApplication",Applications[].class).getBody())) ;
		return applicationList;
	}
	@SuppressWarnings("deprecation")
	@PutMapping("/updateApplication")
	public ResponseEntity<Applications> updateApplication(@RequestBody HashMap<String,String>map)
	{
		System.out.println( map);
		 Applications ap=applicationRepository.getOne( Integer.parseInt(map.get( "id")));
		 ap.setStatus( map.get( "status"));
		 ap.setCategory( map.get("category"));
		 ap.setLoadApplied( map.get("loadApplied"));
		 applicationRepository.save( ap);
		 return ResponseEntity.ok( ap);
		 
		 
		 
	}
	

}
