package com.java.Day14;

public class InnerClassExample4 {
	public Object getName() {
		
		// return new MyObject();
		
		return new Object() {
			@Override
			public String toString() {
				return this.getClass().getName();
			}
		};
	}
	
	/*
	 * class MyObject extends Object{
	 * @Override
	 * public String toString(){
	 * 	return this.getClass().getName();
	 * }
	 * */
	
	public static void main(String[] args) {
		InnerClassExample4 example = new InnerClassExample4();
		System.out.println(example.getName().toString());
	}
}
