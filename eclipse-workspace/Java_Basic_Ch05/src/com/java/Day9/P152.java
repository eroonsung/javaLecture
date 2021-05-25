package com.java.Day9;

public class P152 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 40;
		p1.name = "James";
		p1.gender = "male";
		p1.isMarried = true;
		p1.kids = 3;
		
		Person p2 = new Person();
		p2.age = 30;
		p2.name = "Brian";
		p2.gender = "male";
		p2.isMarried = false;
		p2.kids = 0;
		
		p1.print();
		System.out.println();
		p2.print();
		
	}

}
