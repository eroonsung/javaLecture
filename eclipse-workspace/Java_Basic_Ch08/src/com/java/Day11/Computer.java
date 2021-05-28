package com.java.Day11;

public class Computer extends Calculator{
	public Computer(double r) {
		super(r);
		this.r = r;
	}
	
	@Override
	public double areaCircle() {
		return Math.PI*r*r;
	}
}
