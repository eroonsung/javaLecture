package com.java.Day8;

import java.util.Scanner;

public class MyPet_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] korName = {"곰돌이","복돌이","흰둥이","깨소금","까만콩"};
		String[] engName = {"Bear","Gift","White","Sesami","Black"};
		
		System.out.println("애완견 이름을 입력하세요.");
		String petName = scan.next();
		
		for(int i = 0; i < korName.length; i++) {
			if(petName.equals(korName[i])) {
				System.out.println(engName[i]);
			}
		}
	}
}
