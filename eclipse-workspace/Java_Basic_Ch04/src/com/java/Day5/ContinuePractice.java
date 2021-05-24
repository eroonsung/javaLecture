package com.java.Day5;

public class ContinuePractice {
 public static void main(String[] args) {
	 //1에서 20까지의 수에서 2의 배수와 3의 배수를 제외한 숫자를 출력
	 // for문, continue문 사용
	 int i;
	 
	 for(i=1; i<=20; i++) {
		 if(i%2==0)
			 continue;
		 if(i%3==0)
			 continue;
		 System.out.println(i);
	 }
 }
}
