package com.java.Day10;

public class CarMain {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("자동차", 1000);
		v1.run();
		
		Ambulance a1 = new Ambulance("구급차", 1500, true);
		a1.run();
		a1.siren();
	}
}
