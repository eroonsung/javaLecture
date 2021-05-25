package com.java.Day9;

public class Student {
	//멤버 필드(변수, 식별자)
	int studentID;
	String studentName;
	int grade;
	String address;
	int score;
	
	//멤버 메서드 : 함수
	//1. 클래스 안에서만 존재
	
	//2. 반환 형식이 있음
	public String showStudentInfo() {
		//이름/아이디/주소
		String info = studentName+"/"+studentID+"/"+address;
		return info;
	}
	
	//3. 반환이 없을 수 있음 : void
	//클래스 내부에서 연산/계산/처리
	// 클래스 내부에 저장 -> 출
	public void println() {
		String info = studentName+"/"+studentID+"/"+address;
		System.out.println(info);
	}
	
	//4. 매개 변수를 사용 
	
	// 점수를 전달하고 처리 후 info 반환
	// 멤버 필드에 작성한 int score와 매개변수 int score는 별
	public String setScore(int score) {
		score = score; //local score에 매개변수 score 대입
		String info = showStudentInfo();
		return info +" / score = "+ score;
	}
	public void setScore2(int s) {
		score = s;
		
	}

}
	
