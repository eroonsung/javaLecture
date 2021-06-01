package com.java.Day14;

public class ConstantLiteralMain {

	//멤버필드
	public static void main(String[] args) {
		//지역변수
		final double PI = 3.14; // 상수, 값을 변경할 수 없음
		
		System.out.println(PI);
		// PI = 3.141569; // final value는 대입을 사용할 수 없음
		
		float f=1.0F;
		char c = 'a';
		int i = 1;
		long l = 1L;
	}

}
