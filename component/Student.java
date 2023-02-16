package com.springcore.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student_1")
public class Student {
	
	@Value("Pragya Joshi")
	private String studentName;
	
	@Value("Kolkata")
	private String city;
	
	@Value("#{alist}")
	private List<String>addresses;
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	
	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}
	public Student() {
		super();
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", addresses=" + addresses + "]";
	}
	
	
	
}
