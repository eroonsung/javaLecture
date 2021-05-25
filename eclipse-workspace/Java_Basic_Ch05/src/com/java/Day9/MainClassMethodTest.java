package com.java.Day9;

public class MainClassMethodTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1,num2);

	}
	// 매개변수에 인수 두개를 받아서 계산 결과를 반환하는 메서드
	public static int add(int n1, int n2) {
		int result = n1+n2;
		return result;
	}

}
