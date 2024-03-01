package Encapsulation_Demo;

public class Encapsulation_Class {

	// Encapsulation is achieved by having private variables and public methods

	private int length;

	public void setLength(int l) {

		if (l >= 0) {
			length = l;
		}

		else {
			System.out.println("Invalid Value");
		}

	}

	public int getLength() {

		return length;

	}

}
