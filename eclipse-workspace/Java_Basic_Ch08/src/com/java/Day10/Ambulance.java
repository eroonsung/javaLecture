package com.java.Day10;

public class Ambulance extends Vehicle {
	boolean kit;
	
	public Ambulance(String n, int cc, boolean kit) {
		super(n, cc);
		this.kit = kit;
	}
	
	public void siren() {
		System.out.println(name+"가 사이렌을 울리고 있습니다.(응급키트 : "+kit+")");
	}	
}
