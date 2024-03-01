package Inheritance_Demo;

public class Cars_Child extends Vehicle_Parent {

	public static void main(String[] args) {

		Cars_Child cc = new Cars_Child();

		cc.start();
		cc.carSpeed();
		cc.stop();
	}

	public void carSpeed() {
		System.out.println("Car's speed is 40 Km/hr ");
	}

}
