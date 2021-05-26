package ex.Day10.P;

public class Bus {
	//변수
	private String name;
	private int number;
	//생성자
	public Bus() {
		this("이름 없음", 0);
	}
	public Bus(String name, int num) {
		this.name = name;
		this.number = num;
	}

	//메서드
	public void setBus(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public void print() {
		System.out.println(name+ " / "+number);
	}


}
