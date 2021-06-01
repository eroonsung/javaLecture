package com.java.Day14;

//지역 내부 클래스 응용
public class LocalInnerClass {
	
	//검색
	public void retrieve(String table) {
		//DBtable에서 data row fetch(하나를 꺼냄)
		//책 제목, 저자, 도서 번호
		class Book {
			String title;
			String author;
			String no;
			public Book(String t, String a, String n) {
				this.author = a;
				this.title = t;
				this.no = n;
			}
		}
		String[] result = {"히피", "파울로 코엘료","A1000"};
		Book book1 = new Book(result[0],result[1], result[2]);

		if(book1.title.contains("aaa")) {
			//...
		}
	}
	
	public static void main(String[] args) {
		

	}

}
