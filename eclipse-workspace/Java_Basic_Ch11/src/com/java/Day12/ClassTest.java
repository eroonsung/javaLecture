package com.java.Day12;

import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//1.
		String s = new String();
		Class c1 = s.getClass(); // 클래스 정보를 뽑아줌
		Method[] m = c1.getMethods();
		for(Method method : m) {
			System.out.println(method.getName());
		}
		
		//2. 
		Class c2 = String.class;
		c2 = EqualsTest.class;
		
		//3.
		Class c3 = Class.forName("com.java.Ch11.SystemTestMain");
		
		System.out.println(c3.getName());
	}

}
