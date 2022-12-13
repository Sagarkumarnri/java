package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="applications")
public class Applications {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int applicationId;
	private String category;
	private String loadApplied;
	private String dateOfApplication;
	private String dateOfApproval;
	private String dateOfModification;
	private String status;
	private String reviewerId;
	@Column(name="applicant_id", unique=true)
	private String applicant;
	
	public Applications() {
		super();
	}
	public Applications(String category, String loadApplied, String dateOfApplication, String status, String reviewerId,
			String applicant) {
		super();
		this.category = category;
		this.loadApplied = loadApplied;
		this.dateOfApplication = dateOfApplication;
		this.status = status;
		this.reviewerId = reviewerId;
		this.applicant = applicant;
	}
	public Applications(String category, String loadApplied, String dateOfApplication, String dateOfApproval,
			String dateOfModification, String status, String reviewerId, String applicant) {
		super();
		this.category = category;
		this.loadApplied = loadApplied;
		this.dateOfApplication = dateOfApplication;
		this.dateOfApproval = dateOfApproval;
		this.dateOfModification = dateOfModification;
		this.status = status;
		this.reviewerId = reviewerId;
		this.applicant = applicant;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLoadApplied() {
		return loadApplied;
	}
	public void setLoadApplied(String loadApplied) {
		this.loadApplied = loadApplied;
	}
	public String getDateOfApplication() {
		return dateOfApplication;
	}
	public void setDateOfApplication(String dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
	public String getDateOfApproval() {
		return dateOfApproval;
	}
	public void setDateOfApproval(String dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}
	public String getDateOfModification() {
		return dateOfModification;
	}
	public void setDateOfModification(String dateOfModification) {
		this.dateOfModification = dateOfModification;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReviewerId() {
		return reviewerId;
	}
	public void setReviewerId(String reviewerId) {
		this.reviewerId = reviewerId;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	 
	 
	 

}
