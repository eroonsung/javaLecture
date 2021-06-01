package com.java.Day13;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library1 = new ArrayList<Book>();
		ArrayList<Book> libaray2 = new ArrayList<>();
		
		library1.add(new Book("태백산맥"));
		library1.add(new Book("데미안"));
		library1.add(new Book("어린왕자"));
		library1.add(new Book("히피"));
		library1.add(new Book("길위에서"));
		
		System.out.println("Book size "+ library1.size());
		
		library1.remove(2);
		System.out.println("Book size "+ library1.size());
		
		System.out.println("Books 2: "+library1.get(2).name);
		System.out.println("Books 3: "+library1.get(3).name);

	
		for(Book b : library1) {
			System.out.println(b.name);
		}
	}

}
