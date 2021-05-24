package com.java.Day7;

public class StudentMain2 {

	public static void main(String[] args) {
		//Student 는 과목별 점수에 대해서 Score class 표현한다
		// 어떤 학생의 수학/과학 과목의 점수를 처리하도록 하
		
		//학생 : 홍길동/구로구/3, "수학 100"
		Student2 student = new Student2();
		student.studentName = "홍길동";
		student.grade = 3;
		//class로 들어있기 때문에 new로 할당해야 
		student.subj = new Score2(); 
		student.subj.subject = "수학";
		student.subj.score = 100;
		
		
		System.out.println(student.toString());
		System.out.println(student.subj.toString());
	}

}
