package com.java.Day5;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B00000101; // 5를 8비트 2진수로 나타
		
		System.out.println(num << 2); //20
		System.out.println(num >> 2); //1
		System.out.println(num >>> 2); //1
		
		System.out.println(num); //5
		
		num = num <<2;
		System.out.println(num); //20

	}

}
