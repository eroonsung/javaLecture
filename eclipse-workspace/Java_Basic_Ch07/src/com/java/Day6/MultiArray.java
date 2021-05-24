package com.java.Day6;

import java.util.Arrays;

public class MultiArray {

	public static void main(String[] args) {
		//2X3 배열 : 행우선
		int[][] arr = new int[2][3];
		
		//다차원 배열의 크기 알아내기
		System.out.println("행 : "+arr.length); //2
		System.out.println("열 : "+arr[0].length); //3
		System.out.println("열 : "+arr[1].length); //3
		
		for(int i = 0; i < arr.length; i++) { //행
			for(int j = 0; j< arr[i].length; j++) { //열
				arr[i][j] = 1; //행X열
			}
		}
		//System.out.println(Arrays.toString(arr));
	}
}
