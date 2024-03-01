package Abstraction_Interface_Demo;

public class Circle implements Shape {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.drawShape();
		c.colourShape();

	}

	@Override
	public void drawShape() {
		System.out.println("Drawing Circle");

	}

	@Override
	public void colourShape() {
		System.out.println("Colouring Circle");

	}

}
