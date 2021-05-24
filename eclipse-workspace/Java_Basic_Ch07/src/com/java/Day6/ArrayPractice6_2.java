package com.java.Day6;

import java.util.Scanner;

public class ArrayPractice6_2 {

	public static void main(String[] args) {
		//배열 생성
		String[] StrArray = new String[10];
		
		
		// 입력받기
		Scanner scan = new Scanner(System.in);
		
		
		// 입력된 이름을 배열의 순서에 맞게 저장
		System.out.println("알파벳을 입력하세요. ");
		for(int i=0; i<StrArray.length; i++) {
			StrArray[i]= scan.next();
		}
		for(int i=StrArray.length-1; i > 0; i--) {
			System.out.print(StrArray[i]);
		}

	}

}
