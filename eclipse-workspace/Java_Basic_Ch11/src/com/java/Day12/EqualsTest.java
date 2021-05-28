package com.java.Day12;

class Student{
	int studentID;
	String studentName;
	
	public Student(int id, String name) {
		this.studentID = id;
		this.studentName = name;
	}
	public String toString() {
		return studentID+", "+studentName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(studentID == std.studentID)
				return true;
			else return false;
		}
		return false;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studnetLee2 = studentLee; // 주소 복사
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee == studnetLee2) // 주소 같습니다.
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studnetLee2)) //동일합니다.
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		if(studentLee == studentSang) // 주소 다릅니다
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang)) //동일하지 않습니다.
			// equals override 후 -> 동일합니다.
			System.out.println("studentLee와 studentSang는 동일합니다.");
		else
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
		
		
		System.out.println("studentLee의 hashcode : "+studentLee.hashCode());
		System.out.println("studentSang의 hashcode : "+ studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값 : "+System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : "+System.identityHashCode(studentSang));
	}

}
