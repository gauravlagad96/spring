package com.entities;

public class User {
	private String name;
	private String email;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting name");

		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("setting email");

		this.email = email;
		System.out.println(this.email);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setting pass");
		this.password = password;
		System.out.println(password);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	// create default constructor.
	public User() {
	}

	public User(String name, String email, String password) {
		System.out.println("constructor called");
		this.name = name;
		this.email = email;
		this.password = password;
	}

	
}
