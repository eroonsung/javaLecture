package com.java.Day12;

class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
	Point p = (Point) obj;
	if(this.x == p.x && this.y == p.y) return true;
	else return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return x;
	}
}

public class PointEquals {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10);
		Point p2 = new Point(10, 10);
		
		System.out.println(p1 == p2); //false
		System.out.println(p1.equals(p2)); //false // Override -> true
		
		System.out.println(p1.hashCode()); //123961122 // Override -> 10
		System.out.println(p2.hashCode()); //1227229563 // Override -> 10
	}

}
