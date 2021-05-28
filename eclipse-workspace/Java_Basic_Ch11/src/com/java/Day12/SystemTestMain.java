package com.java.Day12;

public class SystemTestMain {

	public static void main(String[] args) {
		// .. 끝내고자 할 때
		//System.exit(0);
		//System.out.println();
		
		// 시작 시점 시간
		long start = System.nanoTime();
		//동작
		int sum =0;
		for(int i=0; i<=1000000 ; i++) {
			sum += 1;
		}
		
		// 끝 시점 시간
		long end = System.nanoTime();
		
		System.out.println("합: "+ sum);
		System.out.println("시간: "+(end-start));
	}

}
