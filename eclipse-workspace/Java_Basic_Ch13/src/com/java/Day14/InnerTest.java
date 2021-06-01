package com.java.Day14;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10;
			System.out.println("InStaticClass inNum = "+ inNum +"(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass inNum = "+ sInNum +"(내부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass inNum = "+ sNum +"(외부 클래스의 정적 변수 사용)");
		}
		
		static void sTest() {
			//num += 10;
			//inNum == 10;
			System.out.println("OuterClass sNum = "+sNum +"(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = "+sInNum +"(내부 클래스의 정적 변수 사용)");
		}
	}
	
	private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언
	
	public OutClass() {
		inClass = new InClass(); // 외부 클래스 디폴트 생성자
	}
	
	class InClass{
		int inNum = 100;
		//static int sInNum = 200; 
		//인스턴스 내부 클래스에 정적 변수 선언 불가능
		
		void inTest() {
			System.out.println("OutClass num = "+num +"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적 변수)");
		}
		//static void sTest(){} // 인스턴스 내부 클래스에 정적 메서드 정의 불가능
	}
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스를 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();

	}

}
