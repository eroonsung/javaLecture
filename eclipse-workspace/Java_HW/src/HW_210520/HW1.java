package HW_210520;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		int sum = 0;
		int count= 0;
		
		for(int i = 0; sum < num; i++) {
			if(i%2==0) continue;
				sum+=i;
				count++;
		}
		System.out.println("홀수의 개수 : "+count);
		System.out.println("홀수의 합 : "+sum);
	}
}
