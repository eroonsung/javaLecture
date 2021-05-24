package com.java.Day7;

public class ArrayPractice2{
	public static void main(String[] args) {
		String[] info = new String[100];
		info[0] = "홍길동, 1020, 구로구";
		info[1] = "홍수달, 1021, 마포구";
		//info[2] = "홍길동 - 1020 - 구로구"; 
		//구분자를 하나로 통일해야함
			for(int i = 0; i<info.length; i++){
				String person = info[i];
				String[] data = person.split(",");
				System.out.println("이름 : "+data[0]);
				System.out.println("학번 : "+data[1]);
				System.out.println("주소 : "+data[2]);
			}
			//98개의 배열이 비어있기 때문에 에러 발생!!
			// java.lang.NullPointerException
	}
}
