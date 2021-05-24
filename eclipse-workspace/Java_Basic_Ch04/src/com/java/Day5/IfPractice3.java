package com.java.Day5;

import java.util.Scanner;

public class IfPractice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		if (num >0) {
			System.out.println("양수");
		}
		else if (num<0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0입니다.");
		}

	}

}
