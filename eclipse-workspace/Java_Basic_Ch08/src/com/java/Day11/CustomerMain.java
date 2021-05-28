package com.java.Day11;

public class CustomerMain {

	public static void main(String[] args) {
		
 		Customer c1 = new Customer();
		c1.setCustomerName("홍길동");
		c1.setCustomerID(1010);
		c1.bonusPoint = 1000;
		
		Customer c2 = new Customer(2020, "강감찬");
		
		VIPCustomer c3 = new VIPCustomer();
		c3.setCustomerID(3030);
		c3.setCustomerName("김유신");
		c3.bonusPoint = 5000;

		VIPCustomer c4 = new VIPCustomer(4040, "홍길순", 999);
		
		System.out.println(c1.showCustomerInfo());
		System.out.println(c2.showCustomerInfo());
		System.out.println(c3.showCustomerInfo());
		System.out.println(c3.showCustomerInfo());
		System.out.println(c4.showCustomerInfo());
	}
				
}