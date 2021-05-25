package com.java.Day9;

public class MethodClass {
	// 멤버 변수/필드/속
	String name;
	
	
	//멤버 메소드 
	public int add(int i1, int i2) {
		int result;
		result = i1+i2;
		return result;
		// return i1+i2;
	}
	
	public int getTenTotal() {
		//...
		return 10*10; //1.값을 반환 
	}
	
	public void printTenTotal() {
		int total = getTenTotal();
		System.out.println(total);
	}
	public void printGreeting(String name) {
		System.out.println("Hello " +name);
		return; // 2. void 반환 (아무것도 반환하지 않음)
	}
	public void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없음");
			return; //3. code break 의미 
		}else {
			//..
		}
	}
	
	public void test(int num1, int num2) {
		for(int i = 0; i<100; i++) {
			if(i==0) {
				return;
			}
		}
	}
}
