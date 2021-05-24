package com.java.Day6;

import java.util.Scanner;

public class StringPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산식을 입력하세요. 예) 1+1");
		String str = sc.next();
		String[] spl = str.split("");
		
		int num1 = Integer.parseInt(spl[0]);
		int num2 = Integer.parseInt(spl[2]);
		String operator = spl[1];
		int result;
		
		if("+".equals(operator)) {
			result = num1+num2;
		}
		else if("-".equals(operator)) {
			result = num1-num2;
		}
		else if("*".equals(operator)) {
			result = num1*num2;
		}
		else 
			result = num1/num2;
		System.out.println(result);
	}
}
