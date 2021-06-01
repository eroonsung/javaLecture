package com.java.Day14;

//정적 내부 클래스

public class InnerClassExample2 {

	static class InnerClass{
		static String keyword = "STATIC INNER CLASS";
		
		public void printInfo() {
			System.out.println("Inner.info()");
		}
		public static void printName() {
			System.out.println("Inner.printName()");
		}
	}
	
	public static void main(String[] args) {
		InnerClassExample2.InnerClass inner = new InnerClassExample2.InnerClass();
		
		System.out.println("keyword : "+ InnerClass.keyword);
		inner.printInfo();
		InnerClass.printName();

	}

}
