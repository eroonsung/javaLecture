package com.java.Day10;

public class PrimeMain {

	public static void main(String[] args) {
		Prime t1 = new Prime();
		Prime t2 = new Prime(15);
		Prime t3 = new Prime(30);
		
		//t1.primeNumbers();
		//t1.print();
		
		t2.primeNumber();
		t2.print();
		
		t3.primeNumber();
		t3.print();
	}
}
