package Java_Coding_Udemy;

public class Swap {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("Swapped Values using temp Are " + a + " and " + b);

		int x = 10;
		int y = 20;

		x = x + y; //30
		y = x - y; // 10
		x = x - y; // 20

		System.out.println("Swapped Values without using temp Are " + x + " and " + y);

	}

}
