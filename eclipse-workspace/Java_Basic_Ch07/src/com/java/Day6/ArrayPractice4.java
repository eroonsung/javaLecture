package com.java.Day6;

public class ArrayPractice4 {

	public static void main(String[] args) {
		int[] IntArray = new int[] {-12, 3, -9, 5, 8, -2, 0, -8, 3, 10};
		int big = IntArray[0];
		
		for(int i=0; i<IntArray.length; i++) {
			if ((i+1) == IntArray.length) break;
			if(big <= IntArray[i+1])
				big = IntArray[i+1];
		}
		System.out.println(big);
	}

}
