package com.java.Day7;

public class Student { 
	//class 지시자 : 클래스의 코드를 정의하는 곳 
	
	//멤버 필드(변수, 식별자) 
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//멤버 메서드(함수)
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	
}
