package com.java.Day9;

public class Rectangle {
	
	String name;
	float width;
	float height;
	
	public Rectangle() {
		//기본값 
		width = 0;
		height = 0;

		System.out.println("Rectangle 생성자" +" : "+"Width : "+width+ " / "+ "Height : "+height);
	};
	
	public Rectangle(String n) {
		name = n;
		System.out.println("Name : "+name);
	};
	
	public Rectangle(float w, float h) {
		width = w;
		height = h;
		System.out.println("Width : "+width+ " / "+ "Height : "+height);

	}
	
	public Rectangle(String n, float w, float h) {
		name = n;
		width = w;
		height = h;
		System.out.println("Name : "+name+" / "+ "Width : "+width+ " / "+ "Height : "+height);
	}
	
	//method
	public float getArea() {
		float result = width*height;
		return result;
	}

}
