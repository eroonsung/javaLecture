package collection.arraylist;

import java.util.Arrays;
import java.util.Iterator;

import collection.Member;

import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = java.util.Arrays.asList("서초구", "구로구","강서구");
		
		List<Member> list2 = Arrays.asList(new Member(1, "홍길동")
				, new Member(2, "이순신"));
		
		//방법 1 
		for(Member m : list2) {
			m.getMemberName();
		}
		
		//방법 2
		Iterator<Member> it = list2.iterator();
		
		//방법 3
		while(it.hasNext()) {
			Member m = it.next();
			m.getMemberName();
		}
	}

}
