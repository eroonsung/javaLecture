package com.java.Day14;

public class Variable1 {
	//1. 멤버 속성(멤버 변수)
	//자료형 이름;
	//자료형 이름 = 리터럴;
	// 리터럴 : 자료의 표기 방법
	// 자료형 : 기본 자료형, 클래스, 배열,  Enum

//	int level; //선언
//	level1 =10; 
	int level2 = 10; //대입
	short sVal = 10;
	byte b1 = 20;
	byte b2 = 127;
	//byte b3 = 128;
	
	int i = 10;
	long l = Long.MAX_VALUE;
	long l2 = 10L;
	
	double dnum1 = Double.MAX_VALUE;
	double dnum2 = Double.MIN_VALUE;
	
	boolean isBoolean;
	boolean ischar;

	
	//2. 멤버 메서드
	// Modifier [static] return형식(매개변수){}
	// Modifier : public, protected, package, private
	// 리턴형식 : void, 자료형
	
	public void printInfo(int i) {
		
	}
	public void printInfo2(int i, long l, short s, byte b) {
		//코드 블럭
	}
	{
		//코드 블럭
	}
	public int getNumber() {
		return 0; // return 리턴 자료
	}
	
	static int k = 100;
	
	// Starting Point. 시작점
	public static void main(String[] args) {
		int j = 100;
		char c = 'a';
		
		System.out.println(k);
		
		char ch;
		ch = 'B';
		char ch1 = 'A'; // 65
		
		System.out.println(ch);
		System.out.println(ch1);

	}
}
