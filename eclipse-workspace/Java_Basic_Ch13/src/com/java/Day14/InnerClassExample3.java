package com.java.Day14;

//지역 내부 클래스

import java.text.DateFormat;
import java.util.Date;

public class InnerClassExample3 {
	
	public void printStatus() {
		
		class DateFormat{
			private Date date;
	
			public DateFormat(Date date){
				this.date=date;
			}
			public String getDateFormat() {
				return date.toString();
			}
		}
	DateFormat format = new DateFormat(new Date());
	System.out.println("The Date: "+format.getDateFormat());
}
	
	public static void main(String[] args) {
		InnerClassExample3 example = new InnerClassExample3();
		example.printStatus();
	}
}
