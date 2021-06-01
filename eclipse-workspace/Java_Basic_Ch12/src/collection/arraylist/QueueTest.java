package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

class MyQueue{
	private ArrayList<Member> arrayQueue = new ArrayList<Member>();
	
	public void enQueue(Member data) {
		arrayQueue.add(data); //큐의 맨 뒤에 추
	}
	
	public Member dequeue() {
		int len = arrayQueue.size();
		if(len==0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return(arrayQueue.remove(0));
	}
	
}

public class QueueTest {
	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		queue.enQueue(new Member(1, "홍길동1"));
		queue.enQueue(new Member(2, "홍길동2"));
		queue.enQueue(new Member(3, "홍길동3"));
	
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
	}

}
