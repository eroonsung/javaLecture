package com.java.Day7;

import java.util.Arrays;

public class StudentPersonMain {

	public static void main(String[] args) {
		//클래스는 객체화해서 사용 : instantiation
		Student student;
		student = new Student();
		student.studentName = "홍길동";
		student.address = "구로구";
		student.grade = 2;
		
		
		Person person;
		person = new Person();
		
		String student2;
		student2 = new String("홍길동/구로구/2");
		
		String[] data = student2.split("/");
		System.out.println(data[0]);
		
		System.out.println(student2);
	}

}
