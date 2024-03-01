package Java_Coding_Udemy;

public class Multiplication_without_Multiply_Operator {

	public static void main(String[] args) {

		int val = multiply(5, 10);

		System.out.println("Value after Multiplication is " + val);

	}

	public static int multiply(int a, int b) {

		int sum = 0;
		for (int i = 1; i <= b; i++) {
			sum = sum + a;
		}

		return sum;

	}

}
