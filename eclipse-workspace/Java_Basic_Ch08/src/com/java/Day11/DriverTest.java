package com.java.Day11;

class Vehicle{
	public void run() {
		System.out.println("달린다.");
	}
}

class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달린다.");
	}
}

class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달린다.");
	}
}

class Driver{
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

public class DriverTest {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		driver.drive(b);
		driver.drive(t);
	}

}
