package q2;

public class Road {
	public static void main(String[] arg) {
		Truck t = new Truck("IAMATRUCK", "Red", 4);
		Bus b = new Bus("IAMATRUCK", "Red", 4);
		Car c = new Car("Maruti", "Green", 4);
		c.getOwnerName();
		b.getBusNumber();
	}
}
