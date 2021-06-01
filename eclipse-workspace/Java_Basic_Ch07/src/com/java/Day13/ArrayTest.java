package com.java.Day13;

public class ArrayTest {

	public static void main(String[] args) {
		//1번 
		String[] testArray;
		testArray = new String[10]; //초기화, null
		
		System.out.println(testArray[0]);
		
		for(int i = 0; i<testArray.length; i++) {
			System.out.println(testArray[i]);
		}
		
		//exception
		for(int i =0; i<testArray.length; i++) {
			try {
				System.out.println(testArray[i].concat("  "));
			} catch(NullPointerException e) {
				System.out.println(e);
				System.out.println(e.getMessage());
			}

		}
		
		/*
		 * try catch 구
		// 1번 
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//2번 
		try {
			
		}catch(Exception e) {
			
		}finally {
			
		}
		
		//3번 
		try {
			
		}finally {
			
		}
		*/
		String[] testArray2 = new String[10];
		String testArray3[] = new String[10];
		
		//2번 
		String[] testArray4 = new String[] {
				"1", "2", "3", "4","5",
				"6", "7", "8", "9", "10"
		};
		
		//3번 
		String[] testArray5 = {
				"1", "2", "3", "4","5",
				"6", "7", "8", "9", "10"
		};
		
		String[] testArray6 = {};
		
		System.out.println("testArray = "+testArray.length);
		System.out.println("testArray2 = "+testArray2.length);
		System.out.println("testArray3 = "+testArray3.length);
		System.out.println("testArray4 = "+testArray4.length);
		System.out.println("testArray5 = "+testArray5.length);
		System.out.println("testArray6 = "+testArray6.length);
	}

}
