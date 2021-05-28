package com.java.Day12;

import java.util.StringTokenizer;

public class StringSplitTest {

	public static void main(String[] args) {
		String str = "Java Programming is funny things!";
	
		//split()
		String[] result = str.split(" ");
		for(String s : result) {
			System.out.println(s);
		}
		
		//StringTokenizer class
		StringTokenizer stzer = new StringTokenizer(str);
		while(stzer.hasMoreElements()) {
			System.out.println(stzer.nextToken());
		}
	}

}
