package com.java.Day12;

class Book{
	int bookNumber;
	String bookTitle;


	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	@Override
	public String toString() {
		//return bookTitle +", "+bookNumber;
		
		Class c= getClass();
		c.getName();
		return getClass().getName()+ ":"
		+hashCode()+":"
		+Integer.toHexString(hashCode())
		+bookTitle+","+bookNumber; 
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		// 재정의하기 전 -> 인스턴스 정보(클래스 이름.주소 값)를 보여줌
		//com.java.Day12.Book@26f0a63f
		// 재정의 후 -> 개미, 200
		// getClass().getName() -> com.java.Day12.Book:개미,200
		// hashCode() -> com.java.Day12.Book:653305407:개미,200
		//Integer.toHexString(hashCode()) -> com.java.Day12.Book:653305407:26f0a63f개미,200

	}

}
