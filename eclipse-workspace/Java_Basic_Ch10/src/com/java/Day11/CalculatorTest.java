package com.java.Day11;

public class CalculatorTest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 5;
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		calc.showInfo();
	}

}
