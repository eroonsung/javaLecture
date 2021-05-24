package com.java.Day5;

public class ShiftOperation {
	public static void main (String[] args) {
		int num1 = 10;
		int num2 = -10;
		
		System.out.println("<<2 : "+ (num1 << 2)); //40
		System.out.println("<<3 : "+ (num1 << 3)); //80
		System.out.println(">>2 : "+ (num1 >> 2)); // 2
		System.out.println(">>3 : "+ (num1 >> 3)); // 1
		System.out.println(">>>2 : "+ (num1 >>> 2)); //2
		System.out.println(">>>3 : "+ (num1 >>> 3)); //1
		
		System.out.println("<<2 : "+ (num2 << 2)); //-40
		System.out.println("<<3 : "+ (num2 << 3)); //-80
		System.out.println(">>2 : "+ (num2 >> 2)); // -3
		System.out.println(">>3 : "+ (num2 >> 3)); // -2
		System.out.println(">>>2 : "+ (num2 >>> 2)); //1073741821
		System.out.println(">>>3 : "+ (num2 >>> 3)); //536870910
		
	}
}
