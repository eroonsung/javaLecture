package com.java.Day4;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		//1.암묵적 타입 캐스팅
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		//실수
		float f = i;
		double d = f;
		
		System.out.println("b = "+ b); //25
		System.out.println("s = "+ s); //25
		System.out.println("i = "+ i); //25
		System.out.println("l = "+ l); //25
		
		System.out.println("f = "+ f); //25.0
		System.out.println("d = "+ d); //25.0
		
		//2. 명시적 타입 캐스팅
		byte b1 = (byte)256;
		System.out.println("b1 = "+ b1);
		
	}
}
