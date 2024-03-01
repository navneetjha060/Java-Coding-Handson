package Java_Coding_Udemy;

public class Fibanocci {

	public static void main(String[] args) {

		// 0 1 1 2 3 5 8

		int num1 = 0;
		int num2 = 1;

		System.out.print(num1 + " " + num2+" ");

		for (int i = 2; i <= 10; i++) {

			int temp = num1 + num2;

			System.out.print(temp+" ");

			num1 = num2;
			num2 = temp;

		}

	}

}
