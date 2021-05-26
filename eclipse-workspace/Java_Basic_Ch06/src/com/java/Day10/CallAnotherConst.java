package com.java.Day10;

class Person{
	//멤버 변수
	String name;
	int age;
	
	//생성자
	Person(){
		this("이름 없음",1); // 디폴트 생성자를 통해 초기화
		//this를 사용해 Person(String, int)생성자 호출
		//this를 사용하여 다른 생성자 호출 가능
		//조건 : this()생성자 호출은 항상 제일 앞에
	}
	
	//메소드
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}

}
