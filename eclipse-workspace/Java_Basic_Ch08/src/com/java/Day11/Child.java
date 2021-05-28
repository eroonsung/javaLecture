package com.java.Day11;

public class Child extends Parent{
	private int number;
	
	public Child(String name, int number) {
		super(name);
		this.name = name;
		this.number =number;
	}
	
	public void info() {
		System.out.println(super.name+" 가족의 "+this.name+"("+this.number+")"+"입니다. ");
	}
}
