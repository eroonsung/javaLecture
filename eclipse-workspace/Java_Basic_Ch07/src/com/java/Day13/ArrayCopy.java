package com.java.Day13;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1  = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		
		// System.arraycopy(array1, 1, array2, 0, 5);
		//System.arraycopy(array1, 1, array2, 0, array1.length);
		// 안전한 방법 
		
		
		try {
			System.arraycopy(array1, 1, array2, 0, 5);	
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		
		for(int i : array2) {
			System.out.println(i);
		}
		
		Book[] book1 = new Book[3];
		Book[] book2 = new Book[3];
		
		book1[0] = new Book("연금술사");
		book1[1] = new Book("순례자");
		book1[2] = new Book("히피");
	
		System.arraycopy(book1, 0, book2, 0, book2.length);
	}
	
}

