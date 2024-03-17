package com.expl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("com/expl/config.xml");
		Student s =con.getBean("student",Student.class);
		System.out.println(s);
		System.out.println(s.no);
	}
}
