package com.constructor.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApp {

	public static void main(String[] args) {
		
//		Resource r = new ClassPathResource("test.xml");
//		BeanFactory bf= new XmlBeanFactory(r);
		
		ApplicationContext c = new ClassPathXmlApplicationContext("com/constructor/injection/setterConfig.xml");
       	Student st= c.getBean("stu1",Student.class);
		System.out.println(st);
   
		System.out.println(st.show());

	}
}