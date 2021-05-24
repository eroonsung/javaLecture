package com.java.Day6;

import java.util.Scanner;

public class ArrayPractice8 {

	public static void main(String[] args) {
		int[] IntArray = new int[100];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		for(int i=0; i<IntArray.length; i++) {
			IntArray[i]=scan.nextInt();
			
			if(IntArray[i] == -1) {
				System.out.print(IntArray[i-3]+" ");
				System.out.print(IntArray[i-2]+" ");
				System.out.print(IntArray[i-1]+" ");
				break;
			}
		}
		
		
		

	}

}
