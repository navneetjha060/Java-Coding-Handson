package Inheritance_Demo;

public class Truck_Child extends Vehicle_Parent {

	public static void main(String[] args) {

		Truck_Child tc = new Truck_Child();
		tc.start();
		tc.truckSpeed();
		tc.stop();

	}

	public void truckSpeed() {
		System.out.println("Truck's speed is 80 Km/Hr ");
	}

}
