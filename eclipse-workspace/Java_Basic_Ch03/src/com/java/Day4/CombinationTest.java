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
		//�� ���� & ���� �� �� ���� ���� �׿� ����
		System.out.println(num1&=num2); //num1=num1&num2
		//�� ���� | ���� �� �� ���� ���� �׿� ����
		System.out.println(num1|=num2); //num1=num1|num2
		//�� ���� ^ ���� �� �� ���� ���� �׿� ����
		System.out.println(num1^=num2); //num1=num1^num2
	}

}
