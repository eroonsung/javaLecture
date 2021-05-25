package com.java.Day9;

public class RectangleAreaMain {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(20, 15);
		Rectangle rect2 = new Rectangle(19, 80);
		
		System.out.println("사각형 면적 계산");
		System.out.println("Rectangle1 : "+rect1.getArea());
		System.out.println("Rectangle2 : "+rect2.getArea());

	}
}
