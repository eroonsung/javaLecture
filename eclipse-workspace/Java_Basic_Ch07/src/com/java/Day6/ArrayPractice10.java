package com.java.Day6;

import java.util.Scanner;

public class ArrayPractice10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] classAvg = new double[] {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		System.out.println("첫번째 반을 입력하세요.");
		int class1 = scan.nextInt();
		System.out.println("두번째 반을 입력하세요.");
		int class2 = scan.nextInt();
		
		double sum = classAvg[class1-1]+classAvg[class2-1];
		System.out.println("첫번째 반 평균점수 : "+ classAvg[class1-1]);
		System.out.println("두번째 반 평균점수 : "+ classAvg[class2-1]);
		System.out.println("두 반 평균점수의 합 : "+ sum);
		

	}

}
