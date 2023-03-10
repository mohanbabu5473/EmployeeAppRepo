package com.techgeeknext.model;


public class User {

	private int id;
	
	private int age;

	private String name;

	private String role;

	private String email;
	
	private String email1;
	
	private String address;

	public User(int id, String name, String role, String email) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.email = email;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
