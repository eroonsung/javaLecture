package com.java.Day12;

public class StringIndexing {

	public static void main(String[] args) {
		String str = "Java Programming";
		
		System.out.println(str.indexOf("J")); //문자열
		System.out.println(str.indexOf('P')); //문자형
		System.out.println(str.indexOf("gram"));

		System.out.println(str.substring(0, str.indexOf("gram")));
		
		System.out.println(str.lastIndexOf("n")); // 값은 똑같이 나오는데 뒤에서부터 찾음
		
		System.out.println(str.startsWith("Java")); // true
		System.out.println(str.startsWith("gram")); // false
		
		//trim : 공백을 잘라내줌 웬만하면 항상 사용하기!!
		//Scanner => 
		String str1 = "         hahaha";
		String str2 = "hohoho         ";
		String str3 = "    hohoho     ";
		
		System.out.println(str1);
		System.out.println(str1.trim());
		System.out.println(str2.trim());
		System.out.println(str3.trim());
	}

}
