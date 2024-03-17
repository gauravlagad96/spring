package com.setter.injection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Education {
		
	private Map qualification ;

	public Map getQualification() {
		return qualification;
	}

	public void setQualification(Map qualification) {
		this.qualification = qualification;
	}
	

	public void show() {
		Set keys = qualification.keySet();
		Iterator i = keys.iterator();
		while(i.hasNext()) {
			Object key = i.next();
			Object value = qualification.get(key);
			System.out.println(key +"\t"+value);
			}
	}
	
	

}
