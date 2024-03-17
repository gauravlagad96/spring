package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
  public static void main(String[] args) {
	ApplicationContext con = new ClassPathXmlApplicationContext("com/autowired/config.xml");
   Employee e = con.getBean("emp",Employee.class);
   System.out.println(e);
	  
}
}
