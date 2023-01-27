package q2;

public class Truck extends Vehicle {
	public Truck(String model, String color, int wheelCnt) {
		super(model, color, wheelCnt);
	}
	
	public void makeNoise() {
		System.out.println("*Loud Horn noises*");
	}
}