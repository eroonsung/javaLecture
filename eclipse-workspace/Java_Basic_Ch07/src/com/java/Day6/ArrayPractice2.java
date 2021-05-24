package com.java.Day6;

public class ArrayPractice2 {
	public static void main(String[] args) {
		// double 5, 8, 30개 크기의 배열 3개 만들고 크기 출력
		
		double[] doubleArray1 = new double[] {1, 2, 3, 4, 5};
		double[] doubleArray2 = {1,2,3,4,5,6,7,8};
		double[] doubleArray3 = new double[30];
		
		System.out.println("doubleArray1 : "+ doubleArray1.length);
		System.out.println("doubleArray2 : "+ doubleArray2.length);
		System.out.println("doubleArray3 : "+ doubleArray3.length);
	}
}
