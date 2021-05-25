package com.java.Day9;

public class P152_2 {

	public static void main(String[] args) {
		Shopping s1 = new Shopping();
		s1.orderNumber = "201803120001";
		s1.orderID = "abc123";
		s1.orderDate = "2018년 3월 12일";
		s1.orderName = "홍길순";
		s1.orderProduct = "PD0345-12";
		s1.orderAddress = "영등포구";
				
		Shopping s2 = new Shopping();
		s2.orderNumber = "202103120001";
		s2.orderID = "def123";
		s2.orderDate = "2021년 5월 25일";
		s2.orderName = "홍길동";
		s2.orderProduct = "PD0345-12";
		s2.orderAddress = "마포구";
		
		s1.print();
		System.out.println();
		s2.print();
	}

}
