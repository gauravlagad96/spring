package com.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
	
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("com/setter/injection/setterConfig.xml");
		Student s1 =c.getBean("student1",Student.class);
		System.out.println(s1);
		
	}
	
}
