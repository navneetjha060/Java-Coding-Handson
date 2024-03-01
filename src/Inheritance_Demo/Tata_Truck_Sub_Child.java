package Inheritance_Demo;

public class Tata_Truck_Sub_Child extends Truck_Child {

	public static void main(String[] args) {

		Tata_Truck_Sub_Child tt = new Tata_Truck_Sub_Child();

		tt.start();
		tt.truckSpeed();
		tt.stop();
		tt.tataTruck();

	}

	public void tataTruck() {
		System.out.println("Price of Tata Truck is 1 Lac's ");
	}

}
