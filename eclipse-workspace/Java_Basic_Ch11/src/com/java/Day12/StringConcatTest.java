package com.java.Day12;

public class StringConcatTest {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		String str1 = new String("Java");
		String str2 = "Programing";
		String result = "";
		
		int sum = 0;
		for(int i = 0; i<=1000; i++) {
			result = str1.concat(" ");
			result = result.concat(str2);
			sum +=1;
		}
		System.out.println(result);
		
		long end = System.currentTimeMillis();
		
		System.out.println("----Concatenating----");
		System.out.println("합 : "+sum);
		System.out.println("시간 : "+(end-start));
		
		start= System.currentTimeMillis();
		for(int i = 0; i<=1000; i++) {
			result +=" ";
			result += str2;
		}
		end = System.currentTimeMillis();
		
		System.out.println("---- + ----");
		System.out.println("시간 : "+(end-start));
		
	}

}
