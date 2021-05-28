package com.java.Day11;

public class Q4{
	public static void main(String[] args) {
		
	}
}


class Employee{
	public String name;
	public String grade;
	
	public Employee(String name) {
		this.name = name;
	}
}

class Engineer extends Q4{
	public Engineer(String name) {
		super();
	}
	private String skillset;
	public String getSkillset() {
		return skillset;
	}

	public void setSkillSet(String skillset) {
	this.skillset = skillset;
	}
}
