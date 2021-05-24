package com.java.Day5;

import java.util.Scanner;

public class WhilePractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		int i = 1;
		System.out.println("단을 입력해주새요.");
		dan = sc.nextInt();
		
		while(i<10) {
			System.out.println(dan+"X"+i+"="+(dan*i));
			i++;
			
		}
	}
}

