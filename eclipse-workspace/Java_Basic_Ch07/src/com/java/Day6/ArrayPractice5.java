package com.java.Day6;

public class ArrayPractice5 {

	public static void main(String[] args) {
		int[] IntArray = new int[] {-12, 3, -9, 5, 8, -2, 0, -8, 3, 10};
		
		int i = 0;
		int sum = 0;
		int size = 0;
		
		while(true) {
			if(i == 0 ||i%2 == 0) {
				sum += IntArray[i];
				size++;
			}
			i++;
			if(i == IntArray.length) break;
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(sum/size));
		
	}
}
