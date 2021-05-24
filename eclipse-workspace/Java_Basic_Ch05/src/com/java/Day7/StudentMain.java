package com.java.Day7;

public class StudentMain {

	public static void main(String[] args) {
		// 다수의 학생 정보를 관리 
		// 공간 사용 허락 
		Student[] students = new Student[5];
		//클래스들을 객체화하는 방법 **무조건 할당** 해야함
		// 배열 선언해서 사용하는 것과 구분!!
		// 실제 공간 사용
		//만약 밑에 new로 선언 5개 다 안하면 nullexception 발생 		
		students[0] = new Student();
		students[1] = new Student();
		students[2] = new Student();
		students[3] = new Student();
		students[4] = new Student();
		
		students[0].studentName = "홍길동";
		students[0].grade =3;
		
		students[1].studentName = "이순신";
		students[1].grade = 2;
		
		for(int i =0; i<5; i++) {
			System.out.println(students[i]);
			System.out.println(students[i].studentName);
		}
	}

}
