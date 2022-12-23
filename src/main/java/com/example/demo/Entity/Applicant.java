package com.example.demo.Entity;

import org.apache.catalina.User;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "applicant")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Applicant {
	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", applicantName=" + applicantName + ", applicantGender="
				+ applicantGender + ", applicantAdress=" + applicantAdress + "]";
	}

	@Column(name = "applicant_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int applicantId;

	@Column(name="user_id")
	@JsonProperty("userId")
	private int userId;

	@JsonProperty("applicantName")
	private String applicantName;
	@JsonProperty("applicantGender")
	private String applicantGender;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "adress_id")
	@JsonProperty("applicantAdress")
	private ApplicantAdress applicantAdress;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Applicant(int applicantId, int userId, String applicantName, String applicantGender,
			ApplicantAdress applicantAdress) {
		super();
		this.applicantId = applicantId;
		this.userId = userId;
		this.applicantName = applicantName;
		this.applicantGender = applicantGender;
		this.applicantAdress = applicantAdress;
	}

	public Applicant(String applicantGender, String applicantName, ApplicantAdress applicantAdress) {
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
