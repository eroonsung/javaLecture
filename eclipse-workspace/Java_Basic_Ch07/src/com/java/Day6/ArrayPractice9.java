package com.java.Day6;

import java.util.Scanner;

public class ArrayPractice9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char[] charArray = {'P','R','P','G','R','A','M','M','I','N','G'};
		
		int count = 0;
		
		System.out.println("문자를 입력하세요.");
		char input = scan.next().charAt(0);
		
		for(int i =0; i<charArray.length; i++) {
			if(input == charArray[i]) {
				System.out.println("문자의 위치 : " + i + "번");
			}
			else
			count++;
		}
		if(count >= charArray.length)
			System.out.println("none");

	}

}
