package com.java.Day11;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer(); // 추상클래스는 인스턴스로 생성할 수 없음 
		Computer c2 = new Desktop();
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();

	}

}
