package com.java.Day4;

public class ByteVariable {
	public static void main(String[] args) {
		//Byte형 : byte
		byte bs1 = -128;
		//byte bs2 = 128; //2^7
		byte bs2 = Byte.MAX_VALUE;
		
		//Short : 2byte
		short sh1 = 128;
		short sh2 = -32768;
		//short sh3 = 32768; //2^15
		
		//Int : 4byte
		int int1 = 32768;
		int int2 = -2147483648;
		//int int3 = 2147483648;
		
		//Long : 8byte
//		자바는 모든 정수 값을 기본으로 int형으로 처리하기 때문에
//		long형을 나타내는 식별자인 L이나 l을 사용하려는 숫자 뒤에 붙임
		
		long num1 = 2147483648L;
		long num2 = -12345678900L;
		//long num3 = 12345678900;
		
		//int형 범위를 넘지 않고 int형이 long형으로 자동 형변환 됨
		long num4 = 1000; 
		
		//Char
		char ch1 = 'A';
		char ch2 = 'z';
	}
}
