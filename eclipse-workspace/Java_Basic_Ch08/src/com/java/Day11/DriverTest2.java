package com.java.Day11;
import java.util.ArrayList;

class Vehicle2{
	public void run() {
		System.out.println("달린다.");
	}
}

class Bus2 extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달린다.");
	}
}

class Taxi2 extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달린다.");
	}
	public void info() {
		System.out.println("택시에 승객이 탑승했습니다.");
	}
}

class Driver2{
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

public class DriverTest2 {

	public static void main(String[] args) {
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		list.add(new Bus());
		list.add(new Taxi());
		list.add(new Bus());
		list.add(new Taxi());
		list.add(new Bus());
		
		Driver driver = new Driver();
		
		for(Vehicle vehicle : list) {
			driver.drive(vehicle);
		}

	}

}
