package com.java.Day9;

//import com.java.Day7.Student;(방법2 - 충돌 가능성 높음)
//import com.java.Day8.info.Person;

public class Chapter5Main {

	public static void main(String[] args) {
		Student st = new Student(); //kr.java.chapter5
		
		//.operator
		st.studentID = 1000;
		st.studentName = "홍길동";
		st.address = "구로구";
		
		//다른 패키지에 있는 Class도 사용 가능(방법1 - 더 좋은 방법)
		//com.java.Day7.Student st2 = new com.java.Day7.Student();
		com.java.Day9.info.Person p;
		
		//Person p = new Person();(방법2)
		
		//사용
		System.out.println(st.studentName);
		
		//2. 반환 형식 있다.
		String info = st.showStudentInfo();
		System.out.println(info);
		
		System.out.println(st.showStudentInfo()); // 위 출력값과 동일 
		
		//3. 반환 형식 없다
		st.println();
		
		//4. 매개 변수 
		System.out.println(st.setScore(100));
		
		st.setScore2(50);
		System.out.println(st.showStudentInfo());
	}

}
