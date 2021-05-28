package com.java.Day12;

public class HashCodeTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode()); //96354
		System.out.println(str2.hashCode());//96354
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode()); //100
		System.out.println(i2.hashCode());//100

	}

}
