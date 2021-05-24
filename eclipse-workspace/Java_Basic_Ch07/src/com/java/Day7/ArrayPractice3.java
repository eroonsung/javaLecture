package com.java.Day7;
import java.util.Scanner;

public class ArrayPractice3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] student = new String[5];
		int math = 0;
		int science = 0;
		
		for(int i=0; i<student.length; i++) {
			System.out.println("이름/과학/수학 점수를 입력하세요.");
			student[i] = scan.next();
			String person = student[i];
			String[] data = person.split("/");
			
			math += Integer.parseInt(data[1]);
			science += Integer.parseInt(data[2]);
		}
		
		System.out.println("수학 점수 총합 : "+ math);
		System.out.println("과학 점수 총합 : "+ science);
		System.out.println("수학 점수 평균 : "+ math/student.length);
		System.out.println("과학 점수 평균 : "+ science/student.length);
	}

}
