package q2;

public class Vehicle {
	String model;
	String color;
	int wheelCnt;
	public Vehicle(String model, String color, int wheelCnt) {
		this.model = model;
		this.color = color;
		this.wheelCnt = wheelCnt;
	}
	public void start() {
		System.out.println("The vehicle with model "+this.model+"is starting");
	}
}
