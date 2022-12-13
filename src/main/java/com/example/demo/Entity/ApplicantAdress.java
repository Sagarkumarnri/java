package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="adress")
public class ApplicantAdress {
	@Id
	@Column(name="adress_id")
	private String govt_id;
	public ApplicantAdress(String govt_id, String district, String state, String pincode, String ownerShip,
			String govtIdType) {
		super();
		this.govt_id = govt_id;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		this.ownerShip = ownerShip;
		this.govtIdType = govtIdType;
	}
	public ApplicantAdress() {
		// TODO Auto-generated constructor stub
	}
	private String district;
	private String state;
	private String pincode;
	private String ownerShip;
	private String govtIdType;
	@OneToOne(mappedBy="applicantAdress")
	private Applicant applicant;
	public String getGovt_id() {
		return govt_id;
	}
	public void setGovt_id(String govt_id) {
		this.govt_id = govt_id;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getOwnerShip() {
		return ownerShip;
	}
	public void setOwnerShip(String ownerShip) {
		this.ownerShip = ownerShip;
	}
	public String getGovtIdType() {
		return govtIdType;
	}
	public void setGovtIdType(String govtIdType) {
		this.govtIdType = govtIdType;
	}
	public Applicant getApplicant() {
		return applicant;
	}
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	

}
