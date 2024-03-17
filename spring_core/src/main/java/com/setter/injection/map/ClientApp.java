package com.setter.injection.map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext cont = new 
		ClassPathXmlApplicationContext("com/setter/injection/map/map.setter.config.xml");
		Education edu = cont.getBean("qualification",Education.class);
		edu.show();
		
		
	}
}
