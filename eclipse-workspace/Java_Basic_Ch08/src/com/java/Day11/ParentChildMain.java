package com.java.Day11;

public class ParentChildMain {

	public static void main(String[] args) {
		Parent p = new Parent("홍길동");
		Child c = new Child("홍길동주니어", 123);
		
		p.info();
		c.info();
	}
}
