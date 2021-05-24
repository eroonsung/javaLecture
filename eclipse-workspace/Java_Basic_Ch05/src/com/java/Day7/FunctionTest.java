package com.java.Day7;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 40;
		int num2 = 20;
		
		int res1 = add(num1, num2); // add함수 호출
		System.out.println(num1+"+"+num2+"="+res1+"입니다.");
		
		int res2 = sub(num1, num2); 
		System.out.println(num1+"-"+num2+"="+res2+"입니다.");
		
		int res3 = mul(num1, num2); 
		System.out.println(num1+"*"+num2+"="+res3+"입니다.");
		
		int res4 = div(num1, num2); 
		System.out.println(num1+"/"+num2+"="+res4+"입니다.");
		
	}
	public static int add(int n1, int n2) {
		int result = n1+n2;
		return result;
	}
	public static int sub(int n1, int n2) {
		int result = n1-n2;
		return result;
	}
	public static int mul(int n1, int n2) {
		int result = n1*n2;
		return result;
	}
	public static int div(int n1, int n2) {
		int result = n1/n2;
		return result;
	}
}
