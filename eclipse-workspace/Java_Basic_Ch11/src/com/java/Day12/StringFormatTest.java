package com.java.Day12;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class StringFormatTest {

	public static void main(String[] args) {		
		System.out.printf("%s [%d] %s [%d]", "홍길동",100, "고길동",100);
		System.out.println();
		String str = String.format("%s %s", "홍길동", "고길동");
		System.out.println(str);
		
		System.out.println(String.format("%2$10s%1$10s", "KOREA", "JAPAN"));
		System.out.println(String.format("%-10s%-10s", "KOREA", "JAPAN"));
		System.out.println(String.format("%10s%10s", "KOREA", "JAPAN"));
		System.out.println(String.format("%10s%10s", "KOREA", "JAPAN"));
		
		//날짜 포맷팅
		String form = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(form);
		
		//날짜
		Date dt = new Date();
		String now = dt.toString();
		System.out.println(now);
		System.out.println(sdf.format(dt));
		
		//숫자 포맷팅
		DecimalFormat df = new DecimalFormat("#,###0.0");
		String result = df.format(1234459.99);
		System.out.println(result);
		
	}
}
