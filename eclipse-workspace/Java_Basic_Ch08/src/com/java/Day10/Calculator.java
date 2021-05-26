package com.java.Day10;

public class Calculator {
	protected int op1, op2;

	public void setOperand(int op1, int op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public void sum() {
		System.out.println("sum : "+(op1+op2)); 
	}
	
	public void avg() {
		System.out.println("avg : "+(op1+op2)/2); 
	}
}
