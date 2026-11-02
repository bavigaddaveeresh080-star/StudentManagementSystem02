package com.controller;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name="Student")

public class Student 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    
	private Long studentid;
	
    @Column(nullable=false)
	private String firstname;
	
	private String lastname;
	
	@Column(unique=true)
	private String email;
	
	private String  mobileNumber;
	
	private String gender;
	
	private Integer age;
	
	private String course;
	
	private String address;
	
	private double fee;

	public Student() {
		super();
	}
	


	public Student(Long studentid, String firstname, String lastname, String email, String mobileNumber, String gender,
			Integer age, String course, String address, double fee) {
		super();
		this.studentid = studentid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.age = age;
		this.course = course;
		this.address = address;
		this.fee = fee;
	}


	public Long getStudentid() {
		return studentid;
	}



	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

     
	








	
	
	
}
