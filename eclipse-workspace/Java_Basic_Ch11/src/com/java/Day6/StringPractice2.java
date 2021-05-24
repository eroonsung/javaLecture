package com.java.Day6;
import java.util.Scanner;

public class StringPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int count=0;
			System.out.println("숫자를 입력 하세요 ");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("다시 입력하세요:");
				continue;
			}
			
			for(int i = 1;i<=num;i++) {
				
				if(num%i==0) {
					count++;
				}		
		}
			if(count == 2) {
			System.out.println("소수입니다.");
			}else {
			System.out.println("소수가 아닙니다.");
			}
		}
	}
}
