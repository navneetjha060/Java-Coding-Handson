package Java_Important_Interview;

public class Main_Overloading {

	public static void main(String[] args) {
		System.out.println("Hello There");
		main(10);
		main("Test");

	}
	
	public static void main(int a) {
		System.out.println(a);

	}
	
	public static void main(String s) {
		System.out.println(s);
	}
	

}
