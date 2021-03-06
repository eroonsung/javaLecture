package com.java.Day8;

import java.util.Scanner;

public class MorseCode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split("");

		String[] morse = { ".-", "-...", "-.-." ,"-..", ".",
			     "..-.", "--.", "....", "..", ".---",
			     "-.-", ".-..", "--", "-.", "---",
			     ".--.", "--.-", ".-.", "...", "-",
			     "..-", "...-", ".--", "-..-", "-.--",
			     "--.." };
		String[] ap = {"A","B","C","D","E","F","G","H","I","J","K","L",
				"M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"	};
		
		String result = "";
		for(int i=0; i<str.length; i++) {
			for(int j =0; j<ap.length; j++) {
				if(str[i].equalsIgnoreCase(ap[j])) {
					// 알파벳 대소문자 상관없이 같은 것 찾음
					result+=morse[j]+" ";
					continue;
				}
			}
		}
		System.out.println(result);
		
	}

}