package com.java.Day13;

class Box  {
	private Object obj;
	
	public void set(Object o) { 
		this.obj = o;}
	
	public Object get() {
		return this.obj;
	}
}

class Box2<String> {
	private String str;
	
	public void set(String s) { 
		this.str = s;}
	
	public String get() {
		return this.str;
	}
}

public class GenericBoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("Hello");
		
		// String str = box.get(); //오류발생
		String str = (String) box.get();//명시적으로 캐스팅
		
		Box2<String> box2 = new Box2(); // 제네릭 사용
		box2.set("Hello");
		str = box2.get();
	}
}

