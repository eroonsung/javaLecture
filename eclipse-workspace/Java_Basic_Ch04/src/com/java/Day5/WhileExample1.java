package com.java.Day5;

public class WhileExample1 {

	public static void main(String[] args) {
		//1부터 10까지 더하
		int num = 1;
		int sum = 0;
		
		while(num<=10) {
			sum+=num; // sum = sum + num
			num++;
		}
		System.out.println("1부터 10까지의 합은 " +sum+"입니다.");
	}

}
