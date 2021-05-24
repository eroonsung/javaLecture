package com.java.Day4;

public class LogicalTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag); //t
		
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag); //f
		
		flag = (num1 <0) || (num2 >0);
		System.out.println(flag); //t
	}
}
