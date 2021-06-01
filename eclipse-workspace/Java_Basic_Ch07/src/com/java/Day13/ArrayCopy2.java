package com.java.Day13;

public class ArrayCopy2 {

	public static void main(String[] args) {
		Book[] book1 = new Book[3];
		Book[] book2 = new Book[3];
		
		book1[0] = new Book("연금술사");
		book1[1] = new Book("순례자");
		book1[2] = new Book("히피");
	
		System.arraycopy(book1, 0, book2, 0, book2.length);
		
		for(Book b : book2) {
			System.out.println(b.name);
		}
	
		System.out.println("====얕은 복사====");
		book1[0].name = "길위에서";
		
		for(Book b : book1) {
			System.out.println(b.name);
		}
		for(Book b : book2) {
			System.out.println(b.name);
		}
		
		System.out.println("====깊은 복사====");
		//깊은 복사
		//new 를 사용하면 깊은 복사
		//직접 인스턴스를 만들고 그 값을 복사 
		book2[0] = new Book("노르웨이 숲");
		for(Book b : book1) {
			System.out.println(b.name);
		}
		for(Book b : book2) {
			System.out.println(b.name);
		}
		
	}

}
