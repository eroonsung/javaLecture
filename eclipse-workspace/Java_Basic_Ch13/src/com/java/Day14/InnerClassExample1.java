package com.java.Day14;

//인스턴스 내부 클래스

public class InnerClassExample1 {
	//멤버 변수
	private int outerHaschCode;
	public String outerClassName;
	static boolean isOuter;
	
	//inner class
	class InnerClass{
		//inner 멤버 변수
		private int innerHashCode;
		public String innerClassName;
		//final 키워드 단독으로 선언할 수 없음
		static final boolean isInner = true;
		
		//inner 생성자
		public InnerClass() {
			innerHashCode = System.identityHashCode(this);
			innerClassName = this.getClass().getName();
		}
		
		//inner 메서드
		public void printOuterInfo() {
			System.out.println("Outer Hash: "+outerHaschCode);
			System.out.println("Outer name: "+outerClassName);
			System.out.println("It is outer class : "+ isOuter);
		}
		
		public void printInnerInfo() {
			System.out.println("Inner Hash: "+this.innerHashCode);
			System.out.println("Inner name: "+this.innerClassName);
			System.out.println("It is inner class : "+ isInner);
		}
	}
	
	//생성자
	public InnerClassExample1() {
		outerHaschCode = System.identityHashCode(this);
		outerClassName = this.getClass().getName();
		isOuter = true;
	}
	
	// main
	public static void main(String[] args) {
		//외부 클래스 객체 example 생성
		InnerClassExample1 example = new InnerClassExample1();
		//example 객체를 사용하여 내부 클래스 객체 innerExample 생성
		InnerClassExample1.InnerClass innerExample = example.new InnerClass();
		
		innerExample.printInnerInfo();
		System.out.println("==================");
		innerExample.printOuterInfo();
		
	}
}
