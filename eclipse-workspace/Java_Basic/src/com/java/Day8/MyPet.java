package com.java.Day8;

import java.util.Scanner;

public class MyPet {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String[] engName = {"Bear", "Gift", "White","Sesami","Black"};

		System.out.println("애완견 이름을 입력하세요.");
		String petName = scan.next();
		
		switch(petName) {
		case "곰돌이": System.out.println(engName[0]); break;
		case "복돌이": System.out.println(engName[1]); break;
		case "흰둥이": System.out.println(engName[2]); break;
		case "깨소금": System.out.println(engName[3]); break;
		default : System.out.println(engName[4]); 
		}
	}

}
