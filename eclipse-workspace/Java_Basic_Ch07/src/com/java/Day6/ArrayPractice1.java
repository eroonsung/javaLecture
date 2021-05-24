package com.java.Day6;

public class ArrayPractice1 {

	public static void main(String[] args) {
		//10개 짜리 문자열 배열
		
		//첫번째 방법
		String[] testArray;
		testArray = new String[10];
		
		String[] testArray2 = new String[10];
		String testArray3[] = new String[10];

		//두번째 방법
		String[] testArray4 = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		
		//세번째 방법
		String[] testArray5 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		
		String[] testArray6 = {};
		
		System.out.println("testArray = "+ testArray.length);
		System.out.println("testArray2 = "+ testArray2.length);
		System.out.println("testArray3 = "+ testArray3.length);
		System.out.println("testArray4 = "+ testArray4.length);
		System.out.println("testArray5 = "+ testArray5.length);
		System.out.println("testArray6 = "+ testArray6.length);
	}
}
