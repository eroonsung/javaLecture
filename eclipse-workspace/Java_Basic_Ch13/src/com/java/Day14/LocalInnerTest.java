package com.java.Day14;

//지역 내부 클래스 교재
class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num =100; //지역 변수
		// 인터페이스를 통한 상속 -> 업캐스팅 
		class MyRunnable implements Runnable{ //지역 내부 클래스
			int localNum = 10; // 지역 내부 클래스의 인스턴스 변수

			@Override
			public void run() {
				//num = 200; // 지역변수는 상수로 바귐
				//i = 100; // 매개 변수 역시 지역 변수처럼 상수로 바뀜			
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				System.out.println("outNum = "+outNum+"(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = "+Outer.sNum+"(외부 클래스 정적 변수)");
			}
		}
		return new MyRunnable(); //지역 클래스 변수가 살아남아 있음
	}
}

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10); //바깥에서 사용 가능
		runner.run();
	}
}
// closure 개념 이해!!