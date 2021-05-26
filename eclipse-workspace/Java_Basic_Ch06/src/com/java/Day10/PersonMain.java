package com.java.Day10;

class Person10{
	//멤버 변수
	String name;
	String job;
	int age;
	String gender;
	String blood;
	
	//생성자
	Person10(){
		this("이름 없음",0);
	}
	Person10(String name, int age){
		this.name = name;
		this.age= age;
		System.out.println(name+"/"+age);
	}
	Person10(String name, String job, int age, String gender, String blood){
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
		System.out.println(name+"/"+job+"/"+age+"/"+gender+"/"+blood);
	}
	
	//메소드
	public void play() {
		if(job == "의사") System.out.println(name+"/"+job+": 진료한다.");
		else if(job == "골퍼") System.out.println(name+"/"+job+": 라운딩갔다.");
		else if(job == "교수") System.out.println(name+"/"+job+": 강의한다.");
		else System.out.println(name+"/"+job+": ...");
	}
}

public class PersonMain {

	public static void main(String[] args) {
		Person10 p1 = new Person10();
		Person10 p2 = new Person10("홍길동",20);
		Person10 p3 = new Person10("최승희","의사",45,"여","A");
		Person10 p4 = new Person10("이미녀","골퍼",28,"여","O");
		Person10 p5 = new Person10("김미남","교수",47,"남","AB");
		
		p3.play();
		p4.play();
		p5.play();
	}
}
