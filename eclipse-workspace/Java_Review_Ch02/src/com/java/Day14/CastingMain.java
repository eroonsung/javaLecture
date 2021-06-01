package com.java.Day14;

public class CastingMain {

	public static void main(String[] args) {
		int inum2 = 20;
		//묵시적 형변환(autoBoxing)
		float fnum = inum2; // 덜 정밀한 정수에서 더 정밀한 실수로
		System.out.println("int : "+inum2 + " => float : "+fnum);
		
		double dnum;
		dnum = fnum+inum2;
		System.out.println("int : "+inum2+" -> float : "+fnum+" -> double : "+dnum);
	
		//명시적 형변환
		int inum3 = Byte.MAX_VALUE+100;//10;
		byte b = (byte)inum3;
		System.out.println("inum3 : "+inum3+ " -> byte : "+b);
		System.out.println("inum3 : "+Integer.toBinaryString(inum3));
		System.out.println("b : "+Integer.toBinaryString(b));
		
		byte b2 = 127;
		inum3 = (int)b2;
		System.out.println("inum3 : "+inum3+ " -> byte : "+b2);
		System.out.println("inum3 : "+Integer.toBinaryString(inum3));
		System.out.println("b : "+Integer.toBinaryString(b2));
		
		dnum= 3.14;
		inum3 = (int)dnum;
		System.out.println("double : "+dnum+" -> inum3 : "+inum3);
		
		//큰 => 작
		char ch = (char)inum3;
		System.out.println("inum3 : "+inum3+" -> char : "+ ch);
		
		//연산 중 형 변환
		
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1+(int)fNum2; // 형 변환 후 연산
		int iNum4 = (int)(dNum1+fNum2); // 실수 연산 후 형 변환
		System.out.println(iNum3); //1
		System.out.println(iNum4); //2
	}
}
