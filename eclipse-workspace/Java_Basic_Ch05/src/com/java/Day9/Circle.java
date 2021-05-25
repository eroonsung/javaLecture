package com.java.Day9;

public class Circle {
	//멤버 필드
	String name;
	double radius;
	
	//생성자 
	public Circle(String n, double ra) {
		name =n;
		radius = ra;
		//System.out.println("Name : "+name+" / "+ "Radius : "+radius);
	}
	//메소드
	public double getArea() {
		double result = radius*radius*3.14;
		return result;
	}
}
