package com.java.Day4;

public class CombinationTest {

	public static void main(String[] args) {
		int num1 = 100;
		
		System.out.println(num1+=2);
		System.out.println(num1-=2);
		System.out.println(num1*=2);
		System.out.println(num1/=2);
		System.out.println(num1%=2);
		System.out.println(num1<<=2);
		System.out.println(num1>>=2);
		System.out.println(num1>>>=2);
		
		int num2 = 50;
		//두 항의 & 연산 후 그 값을 왼쪽 항에 대입
		System.out.println(num1&=num2); //num1=num1&num2
		//두 항의 | 연산 후 그 값을 왼쪽 항에 대입
		System.out.println(num1|=num2); //num1=num1|num2
		//두 항의 ^ 연산 후 그 값을 왼쪽 항에 대입
		System.out.println(num1^=num2); //num1=num1^num2
	}

}
