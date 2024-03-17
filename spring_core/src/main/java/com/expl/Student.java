package com.expl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{2+2}")
	public int add;
	
	@Value("#{2*2}")
	public int mul;
	
	@Value("#{2/2}")
	public int div;
	
	@Value("#{2%2}")
	public int mod;
	
	@Value("#{2==2}")
	public boolean checkCondition;
	
	@Value("#{1>3 ? 'yes': 'no'}")
	public String checkTernary;
	
	@Value("#{3 lt 4 }")// lt
	public String equalValid;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	public int no;

	@Override
	public String toString() {
		return "Student [add=" + add + ", mul=" + mul + ", div=" + div + ", mod=" + mod + ", checkCondition="
				+ checkCondition + ", checkTernary=" + checkTernary + ", equalValid=" + equalValid + "]";
	}

	
	
	}

	
	

