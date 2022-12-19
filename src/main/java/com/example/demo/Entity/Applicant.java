package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="applicant")
public class Applicant {
	private static final String ADRESS_ID = "adress_id";
	@Column(name="Id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int applicantId;
	  @JsonProperty("applicantName") private String applicantName;
	  @JsonProperty("applicantGender")private String applicantGender;
	  @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	  @JoinColumn(name="adress_id")
	  @JsonProperty("applicantAdress")
	  private ApplicantAdress applicantAdress;
	public Applicant( String applicantGender,String applicantName, ApplicantAdress applicantAdress) {
		super();
		this.applicantName = applicantName;
		this.applicantGender = applicantGender;
		this.applicantAdress = applicantAdress;
	}
	public ApplicantAdress getApplicantAdress() {
		return applicantAdress;
	}
	public void setApplicantAdress(ApplicantAdress applicantAdress) {
		this.applicantAdress = applicantAdress;
	}
	public Applicant() {
		super();
	}
	public static String getAdressId() {
		return ADRESS_ID;
	}
	 
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantGender() {
		return applicantGender;
	}
	public void setApplicantGender(String applicantGender) {
		this.applicantGender = applicantGender;
	}
	public Applicant(String applicantName, String applicantGender) {
		super();
		this.applicantName = applicantName;
		this.applicantGender = applicantGender;
	}
	  
}
