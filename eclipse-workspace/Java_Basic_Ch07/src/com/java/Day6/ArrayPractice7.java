package com.java.Day6;

import java.util.Arrays;

public class ArrayPractice7 {

	public static void main(String[] args) {
		int[] leftArray = new int[] {10,20,30};
		int[] rightArray = new int[] {10,20,30};
		
		if(Arrays.equals(leftArray, rightArray)) {
			System.out.println("두 배열이 동일합니다.");
		}else {
			System.out.println("두 배열이 다릅니다.");
		}

	}
}
