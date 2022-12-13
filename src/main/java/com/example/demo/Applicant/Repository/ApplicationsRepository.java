package com.example.demo.Applicant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Applicant;
import com.example.demo.Entity.Applications;

public interface ApplicationsRepository extends JpaRepository<Applications,Integer> {
	

}
