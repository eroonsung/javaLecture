package com.java.Day6;

public class StringTest {
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = "test";
		String str3 = "test";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		str2 = "test2";
		System.out.println(str2);
		System.out.println(str3);
		
		String str4;
		str4 = "123";
		System.out.println(str4);
		
		//final char charAt(int)
		// 상수 : final int PI = 3.14;
		
		//dot operator: .
		System.out.println(str4.charAt(0)); //1
		System.out.println(str4.charAt(1)); //2
		System.out.println(str4.charAt(2)); //3
		
		//반복문을 사용해서 출력하기
		//.charAt(index)
		String str5;
		str5 = "하나둘셋";
		
		System.out.println(str5.length());//4
		int len = str5.length();
		
		for(int i=0; i<len; i++) {
			System.out.println(str5.charAt(i));
		}
		//.equals(string)
		System.out.println(str5.equals(str4)); //false
		System.out.println(str3.equals(str2)); //false
		System.out.println("123".equals(str4)); //true
		
		//.split()
		String[] strs = "하나 둘 ㄹ 셋 ㅅ 넷".split(" ");
		System.out.println(strs.length); //6
		System.out.println(strs[0]); //하나
		System.out.println(strs[4]); //ㅅ
		
		
		
		//.substring(시작index, 마지막index)
		System.out.println("하 나 둘 ㄹ 셋 ㅅ 넷".substring(2, 4));//나
		System.out.println("하 나 둘 ㄹ 셋 ㅅ 넷".substring(5)); // ㄹ 셋 ㅅ 넷
	}
}
