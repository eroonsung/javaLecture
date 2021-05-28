package com.java.Day12;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		@Deprecated
		Integer i1 = Integer.valueOf(100);
		Integer i2 = new Integer(100); 
		//Wrapper클래스들은 직접 new로 만들 수 없음
		
		// Integer i3 = i1;
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));

	}

}
