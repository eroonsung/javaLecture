package com.java.Day12;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		
		//박싱
		//생성자를 사용하지 않고 정수나 문자열을 바로 Integer 클래스로 반환받을 수 있음
		i1 = Integer.valueOf(100);
		i1 = Integer.valueOf("1000");
		
		//언박싱
		//Integer 클래스 내부의 int 자료형 값을 가져오기 위해서 사용
		int i = i1.intValue();
		//문자열이 어떤 숫자를 나타낼 때 문자열에서 int 값을 바로 가져와서 반환
		i = Integer.parseInt("100");
		
		Byte bt = Byte.valueOf("11");
		byte b = Byte.parseByte("11");
		
		Float ft = Float.valueOf("2.4F");
		
		//비교연산
		i1= Integer.valueOf("1000");
		Integer i2 = Integer.valueOf("1000");
		
		if(i1.equals(i2)) {
			System.out.println("1000");
		}
		if(i1==i2) {
			System.out.println("1000");
		}
		
	}

}
