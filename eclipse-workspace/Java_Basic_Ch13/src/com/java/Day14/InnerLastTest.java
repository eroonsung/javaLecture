package com.java.Day14;

//Outer class 외부 클래스
public class InnerLastTest {
	//새로운 멤버 객체 어디서나 만들 수 있음
	Object o = new Object() {
		@Override
		public String toString() {
			return super.toString();
		}
	};
	
	//생성자
	public InnerLastTest() {
		
	}
	
	// 지역 내부 클래스
	void method() { 
		class LocalInner{
			int c =10;
			// static int b =100;
			public LocalInner() {
				
			}
		}
		LocalInner d = new LocalInner();
		d.c =1000;
	}	
	
	//익명 클래스
	Object method2() {
		return new Object() {
			@Override
			public String toString() {
				return InnerLastTest.class.getName();
			}
		};
	}
	
	//익명 클래스 + 인터페이스
	Runnable method3() {
		return new Runnable() {
			
			@Override
			public void run() {
				
			}
		};
	}
	
	// 인스턴스 내부 클래스
	public class InstanceInner{
		//멤버변수
		int abc;
		static final int a=10;
		
		//생성자
		public InstanceInner(){
			
		}
		//메소드
		public void print() {
			abc = 1000;
			System.out.println(abc);
		}
	}
	
	// 정적 내부 클래스
	static class StaticInner{
		//멤버변수
		int abc;
		static int b = 1000;
		
		//생성자 만들 수 있음
		public StaticInner() {
			
		}
		
		//메소드
		public void print() {
			System.out.print(abc);
			System.out.println(StaticInner.b);
		}
		static void info() {
			//static한 변수들만 쓸 수 있음
			System.out.println(b);
		}
	}
}
