package com.java.Day10;

public class StudentTest {

	public static void main(String[] args) {
		Student sLee = new Student();
		//sLee.studentName("이상원"); -> 직접적인 방법 X
		sLee.setStudentName("이상원"); //-> 간접적인 방법 O
		
		System.out.println(sLee.getStudentName());
	}
}
