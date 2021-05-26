package com.java.Day10;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperand(10, 20);
		c1.sum();
		c1.avg();
		
		SubCalculator s1 = new SubCalculator();
		s1.setOperand(40, 30);
		s1.sum();
		s1.avg();
		s1.sub();
	}
}
