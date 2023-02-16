package com.springcore.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	@Value("101")
	private int id;
	@Value("Isha")
	private String name;
	@Value("Manager")
	private String desg;
	@Value("#{contactList}")
	private List<String>contact;
	@Value("#{projList}")
	private List<String>projects;
	public Person(int id, String name, String desg, List<String> contact, List<String> projects) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.contact = contact;
		this.projects = projects;
	}
	public Person() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public List<String> getContact() {
		return contact;
	}
	public void setContact(List<String> contact) {
		this.contact = contact;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", desg=" + desg + ", contact=" + contact + ", projects="
				+ projects + "]";
	}
	
	
}
