package com.java.Day5;

import java.util.Scanner;

public class IfPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요!");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num > 0) {
			System.out.println(num);			
		}
		else {
			System.out.println("안녕~");	
		}
		
	}
}
