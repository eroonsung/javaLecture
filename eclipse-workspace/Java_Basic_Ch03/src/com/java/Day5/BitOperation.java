package com.java.Day5;

public class BitOperation {
	public static void main (String[] args) {
		int num1 = 5;
		int num2 = 10;
		int num3 = 7;
		
		System.out.println(num1&num2); //0
		System.out.println(num1|num2); //15
		System.out.println(num1^num2); //15
		System.out.println(~num1); //-6
		System.out.println(~num2); //-11
		
		System.out.println(num2&num3); //2
		System.out.println(num2|num3); //15
		System.out.println(num2^num3); //13
		System.out.println(~num3); //-8
		
		//논리 연산자와 비트 논리 연산자 차이
		boolean t = (num1 >= num2) && (num2 >= num3);
		System.out.println(t); // false
	}
}
