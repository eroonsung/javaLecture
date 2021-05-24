package com.java.Day6;

import java.util.Scanner;
public class StringPractice2_2 {
	public static void main (String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i = 2; // i는 나눌 대상
		boolean isPrime = true;
		
		while(i <= num) {
			isPrime = true; //2%2=0이지만 소수이기 때문에
			
			for(int n = 2; n < i; n++) {
				if(i%n == 0) {
					isPrime = false;
				}
				continue;
			}
			if(isPrime == true) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("");
	}
}
