package com.java.Day12;

class Point2{
	int x;
	int y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " +x+", "+ "y = "+y;
	}
}

// 객체를 복제해도 된다는 의미로 Cloneable 인터페이스를 함께 선언
class Circle implements Cloneable{
	//클래스 안에 클래스 생성할 수 있음
	Point2 point;
	int radius;
	
	Circle (int x, int y, int radius){
		this.radius = radius;
		point = new Point2(x, y);
	}
	
	public String toString() {
		return "원점은 "+point+"이고,"+ "반지름은 "+radius+"입니다.";
	}
	@Override
	// clone() 메서드를 사용할 때 발생할 수 있는 오류를 예외처리함
	// 예외처리는 성능에 무리를 줌! 너무 남용하지 말 것
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		// clone() 메서드를 사용해 circle 인스턴스를 copyCircle에 복제함
		//얕은 복사
		Circle circle2 = circle;
		
		//깊은 복사
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circle2));
		System.out.println(System.identityHashCode(copyCircle));
		// 멤버 변수가 동일한 인스턴스가 다른 메모리에 새로 생성됨
	}
}
