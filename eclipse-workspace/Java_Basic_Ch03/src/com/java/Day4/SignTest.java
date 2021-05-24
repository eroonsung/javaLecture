package com.java.Day4;

public class SignTest {

	public static void main(String[] args) {
		
		//int
		int num = 10;
		
		System.out.println(+num); //10
		System.out.println(-num); //-10, num 값이 실제로 바뀌지는 않음
		System.out.println(num); //10
		
		num = -num;
		System.out.println(num); // -10
		
		//byte
		byte bs = 10;
		System.out.println(+bs);
		System.out.println(-bs);
		System.out.println(bs);
//		bs = -bs;
//		System.out.println(bs);
		
		
		//short
		short sh = 10;
		System.out.println(+sh);
		System.out.println(-sh);
		System.out.println(sh);
//		sh = -sh;
//		System.out.println(sh);
		
		//long
		long ln = 10;
		System.out.println(+ln);
		System.out.println(-ln);
		System.out.println(ln);
		ln = -ln;
		System.out.println(ln);
	}

}
