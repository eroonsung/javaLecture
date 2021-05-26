package com.java.Day10;

public class Prime {
	
	//멤버 변수
	int number;
	int primeNumbers[];
	
	//생성자
	Prime(){
		primeNumbers = new int[1000];
		for(int i : primeNumbers) {
			primeNumbers[i] = -1; // 멤버 변수 배열 초기화
		}
	};
	
	Prime(int t){
		this(); // 위에 생성자 호출
//		primeNumbers = new int[1000];
//		for(int i : primeNumbers) {
//			primeNumbers[i] = -1; 
//		}
		number = t; //this.number = t;
	};

	//메소드
	public int[] primeNumber() {
		int i = 2;
		int j = 0;
		boolean isPrime = true;
		
		while(i <= number) {
			isPrime = true; 
			
			for(int n = 2; n < i; n++) {
				if(i%n == 0) {
					isPrime = false;
				}
				continue;
			}
			if(isPrime == true) {
				primeNumbers[j] = i; 
			}
			i++;
			j++;
		}
		return primeNumbers;
	};
	
	public void print() {
		System.out.println("0부터 "+number+"까지의 소수는 ");
		for(int i : primeNumbers) {
			if(i != 0) 
				System.out.print(i+" ");
		}
		System.out.println();
	};
	
}
		


