package com.java.Day10;

public class Vehicle {
	//매개 변수
	String name;
	int cc;
	
	//생성자
	public Vehicle() {
		this("none", 0);
	}
	public Vehicle(String n, int cc) {
		this.name = n;
		this.cc = cc;
	}
	
	//메소드
	public void run() {
		System.out.println(name+"가 달리고 있습니다.");
	}
	
	
}
