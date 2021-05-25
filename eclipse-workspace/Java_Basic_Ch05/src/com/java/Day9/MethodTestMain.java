package com.java.Day9;

//class Student {
//	String name;
//}
//
//class Student1 {
//	int id;
//	String subject;
//	
//}

public class MethodTestMain {

	public static void main(String[] args) {
		//방법1
		MethodClass m = new MethodClass();
		//방법2
		MethodClass m1;
		m1 = new MethodClass(); //인스턴스 생성하
				
				
		int r = m.add(20, 100);
		// 선언하고 꼭 사용하지 않아도 됨 
		m.name = "홍길동";
		
		m.add(10,100);
		
		m.printTenTotal();
		
		m.getTenTotal();
		
		m.printGreeting("hahaha");
		
		m.divide(100, 0);
		
		m.divide(100, 1);

	}

}
