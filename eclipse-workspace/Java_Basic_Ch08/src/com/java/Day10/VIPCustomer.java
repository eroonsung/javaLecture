package com.java.Day10;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP"; //상위 클래스에서 private변수이므로 오류 발생
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출 ");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // 상위 클래스 생성자 호출
		//하위 클래스가 생성될 때는 상위 클래스의 디폴트 생성자를 호출하는 super()가 자동으로 생성됨
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo()+" 담당 상담원 아이디는 "+agentID+"입니다.";
	}
}
