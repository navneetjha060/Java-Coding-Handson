package Abstraction_Class_Demo;

public class Circle extends Shape_Demo {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.drawShape();
		c.colourShape();
		Shape_Demo.samplePrint();

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
