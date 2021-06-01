package collection.map;

import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 1);
		map.put("고길동", 2);
		map.put("이길동", 3);
		map.put("한길동", 4);
		
		Iterator<String> il = map.keySet().iterator();
		
		while(il.hasNext()) {
			String key = il.next();
			Integer value = map.get(key);
			System.out.println(key+ " : "+value);
		}
	}

}
