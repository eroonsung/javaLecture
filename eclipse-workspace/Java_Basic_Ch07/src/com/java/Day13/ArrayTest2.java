package com.java.Day13;

public class ArrayTest2 {
	public static void main(String[] args) {
		double[] data = new double[5];
		
		for(int i = 0; i<data.length; i++) {
			//이런 방식 쓰지 않기!
			System.out.println(data[i]);
			System.out.println(data[i]+1);
		}
		
		for(int i = 0; i<data.length; i++) {				
			data[i] = -1.0;
		}
		
		int index = 0;
		data[0] =10.0; index++;
		data[1] = 11.0; index++;
		data[2] = 0.5; index++;
		
		//삭제
		data[2] = -1.0; index--;
		
		System.out.println("배열 : "+ data.length+" 인덱스 : "+index);
		
	for(int i =0; i< index; i++) {
		System.out.println(data[i]);
	}
}
}
