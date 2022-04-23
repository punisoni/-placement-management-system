package com.placement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String name;
	private String fathername;
	private String DOB;
	private String email;
	private String phone;
	private String PRNno;
	private String Aadharno;
	private String Resume;
	
	@ManyToOne
	private User user;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPRNno() {
		return PRNno;
	}
	public void setPRNno(String pRNno) {
		PRNno = pRNno;
	}
	public String getAadharno() {
		return Aadharno;
	}
	public void setAadharno(String aadharno) {
		Aadharno = aadharno;
	}
	public String getResume() {
		return Resume;
	}
	public void setResume(String resume) {
		Resume = resume;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
