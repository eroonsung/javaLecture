package com.java.Day9;

public class CircleMain {

	public static void main(String[] args) {
		Circle cir1 = new Circle("피자", 10);
		Circle cir2 = new Circle("도넛", 2);
		
		System.out.println("==================");
		System.out.println(cir1.name+"의 면적은 "+cir1.getArea());
		System.out.println(cir2.name+"의 면적은 "+cir2.getArea());
	}
}
