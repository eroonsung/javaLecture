package com.java.Day4;

public class DoubleEx1 {

	public static void main(String[] args) {
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		//minus
		double dnum2 = -3.14;
		float fnum2 = -3.14F;
		
		System.out.println(dnum2);
		System.out.println(fnum2);
		
		//float to int
		
		System.out.println("double2long: "+(long)dnum2); //-3
		System.out.println("double2int: "+(int)dnum2); //-3
		System.out.println("double2short: "+(short)dnum2); //-3
		System.out.println("double2byte: "+(byte)dnum2); //-3
		
//		int i1 = fnum;
//		long l1 = dnum; 
		
		//int to float/double
		int int1 = 314;
		System.out.println("int2float: "+(float)int1); //314.0
		System.out.println("int2double: "+(double)int1); //314.0
		
		int int2 = 2147483647;
		int int3 = -2147483648;
		System.out.println("int2float: "+(float)int2); //2.14748365E9
		System.out.println("int2float: "+(float)int3); // -2.14748365E9
		System.out.println("int2double: "+(double)int2); //2.14748365E9
		System.out.println("int2double: "+(double)int3); // -2.14748365E9
	}
}
