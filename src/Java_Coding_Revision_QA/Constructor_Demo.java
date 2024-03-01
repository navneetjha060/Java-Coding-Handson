package Java_Coding_Revision_QA;

public class Constructor_Demo {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Constructor_Demo cd = new Constructor_Demo("Hello");

	}

	public Constructor_Demo() {
		System.out.println("This is my constructor");
	}

	public Constructor_Demo(String s) {
		System.out.println("This is my constructor " + s);
	}

}
