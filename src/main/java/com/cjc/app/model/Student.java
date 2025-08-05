package com.cjc.app.model;

public class Student {

	private String firstName;
	private String lastName;
	private long mobileNo;
	private String email;
	private String birthDate;
	private String gender;

	public Student() {
		System.out.println("Student :: Constructor");
	}

	public Student(String firstName, String lastName, long mobileNo, String email, String birthDate, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo + ", email="
				+ email + ", birthDate=" + birthDate + ", gender=" + gender + "]";
	}}
