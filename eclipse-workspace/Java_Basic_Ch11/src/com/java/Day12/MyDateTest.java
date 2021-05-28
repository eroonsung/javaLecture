package com.java.Day12;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	@Override
	public boolean equals(Object obj) {
		MyDate md = (MyDate) obj;
		if (this.day == md.day && this.month == md.month && this.year == md.year)
			return true;
		else return false;
	}
}

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(11,4,1997);
		MyDate date2 = new MyDate(11, 4, 1997);
		System.out.println(date1.equals(date2));// false // Override -> true

	}

}
