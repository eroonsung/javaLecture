package com.java.Day14;
//stream
public class TravelCustomer {
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String n, int a, int p) {
		this.name = n;
		this.age = a;
		this.price = p;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return "name : "+name+"age : "+age+"price : "+price; 
	}
}
