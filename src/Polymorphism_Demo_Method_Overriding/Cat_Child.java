package Polymorphism_Demo_Method_Overriding;

public class Cat_Child extends Animal_Parent {

	public static void main(String[] args) {

		Cat_Child cc = new Cat_Child();
		cc.sound();

	}

	public void sound() {
		System.out.println("Cat makes noise ");
	}

}
