package com.java.Day7;

public class StudentMain3 {

	public static void main(String[] args) {
		//Student2, Score2 클래스 사용
		//subj를 배열로!
		//홍길동/구로구/3, 수학 100, 국어 90 
		//고길동/영등포구/3, 수학 70, 국어 80
		
		Student3[] students = new Student3[2];
		students[0] = new Student3();
		students[1] = new Student3();
		
		students[0].studentName = "홍길동";
		students[0].grade = 3;
		students[0].address = "구로구";
		students[0].subj = new Score3[2];
		students[0].subj[0]=new Score3();
		students[0].subj[0].subject ="수학";
		students[0].subj[0].score= 100;
		students[0].subj[1]=new Score3();
		students[0].subj[1].subject ="국어";
		students[0].subj[1].score= 90;
		
		students[1].studentName = "고길동";
		students[1].grade = 3;
		students[1].address = "영등포구";
		students[1].subj = new Score3[2];
		students[1].subj[0]=new Score3();
		students[1].subj[0].subject ="수학";
		students[1].subj[0].score= 70;
		students[1].subj[1]=new Score3();
		students[1].subj[1].subject ="국어";
		students[1].subj[1].score= 80;
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		
		for(int i=0; i< students.length; i++) {
			Student3 student = students[i];
			System.out.println(student.studentName);
		}
		
		for(Student3 student : students) { //(변수 : 배열)
			System.out.println(student.address);
		}
		
		


	}

}
