package com.java.Day4;

public class CharacterEx1 {
	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); //문자 출력 : A
		System.out.println((int)ch1); //문자에 해당하는 정수 값(아스키코드값) 출력 : 65
		
		char ch2 = 66; // 정수 값 대입
		System.out.println(ch2); // 정수 값에 해당하는 문자 출력 : B
		
		int ch3 = 67;
		System.out.println(ch3); // 문자 정수 값 출력 : 67
		System.out.println((char)ch3); // 정수 값에 해당하는 문자 출력 : C
		
		// 복습
		char ch4 = 'Z';
		System.out.println(ch4); //Z
		System.out.println((int)ch4); //90
		char ch5 = 38;
		System.out.println(ch5); // &
		int ch6 = 97;
		System.out.println(ch6); //97
		System.out.println((char)ch6); //a
	}
}