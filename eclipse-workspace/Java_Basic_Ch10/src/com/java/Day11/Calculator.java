package com.java.Day11;

public class Calculator implements Calc {

	@Override
	public int add(int n1, int n2) {
		return n1+n2;
	}

	@Override
	public int substract(int n1, int n2) {
		return n1-n2;
	}

	@Override
	public int times(int n1, int n2) {
		return n1*n2;
	}

	@Override
	public int divide(int n1, int n2) {
		if(n2 != 0) return n1/n2;
		else return Calc.Error;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다. ");
	}

}
