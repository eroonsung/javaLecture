package com.java.Day14;

public class OperatorEx1 {

	// 단항 : ++, --
	// 이항 : 인수[+,-,/,*]
	// 삼항 : 조건 ? 참일 때 : 거짓일 때
	
	public static void main(String[] args) {
		// 대입 연산자: 왼쪽 변수에 값(일반값, 객체값)을 대입
		int i = 0;
		int j;
		j = 10;
		
		j = i*10000;
		
		//부호 : +, -
		j = 10;
		j = -10;
		
		//삼항 연산자
		// 조건식: 대소<,>, 동등...
		int score = 90;
		int grade = (score>80)? 1: 2;
		
		grade = (score>80)? 1:(score<70)?4:3;
		System.out.println("Score : "+score+" -> Grade : "+grade);
		
		//산술연산자
		System.out.println("+"+(3+3));
		System.out.println("+"+3+3);
		
		//증감연산자
		score = 150;
		System.out.println("++score : "+(++score));
		score = 150;
		System.out.println("score++ : "+(score++));
		
		//관계연산자 -> 조건식 작성
		// >, <, >=, <=, ==, !=
		
		//기본 자료형: 값
		//객체 : 객체의 값 -> 객체의 해시코드(가상의 메모리주소)
		System.out.println("1>0 : "+(1>0));
		System.out.println("1<0 : "+(1<0));
		
		//대등연산자
		System.out.println("1 == 0 : "+(1 == 0));
		//객체의 대등연산자 처리
		System.out.println("홍 : "+System.identityHashCode("홍"));
		System.out.println("홍 == 홍 : "+("홍"=="홍"));
		
		//논리연산자
		//&&(논리곱). ||(논리합). !(부정)
		System.out.println((5>3)&&(5>2));
		System.out.println((5<3)&&(5>2));
		System.out.println((5>3)||(5>2));
		System.out.println(!(5>3));
 	}

}
