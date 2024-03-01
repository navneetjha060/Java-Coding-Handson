package Java_Coding_Revision_QA;

public class Loops_Demo {

	public static void main(String[] args) {

		// While Loop
		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}

		System.out.println("=================================");

		// Do-While Loop
		int b = 1;
		do {
			System.out.println(b);
			b++;
		} while (b <= 10);

		System.out.println("=================================");

		// For Loop
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("=================================");

		// For-Each Loop
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int x : arr) {
			System.out.println(x);
		}

	}

}
