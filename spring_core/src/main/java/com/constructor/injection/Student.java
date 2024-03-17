package com.constructor.injection;

public class Student {

	private int id;
	private String name;

	// constructor dependancy injection 
	public Student(int id,String name){
		this.id=id;
	    this.name=name;
		}

	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}



	public String show() {
	return "Id : "+ id + "     Name :"+ name;
	}
	
}

