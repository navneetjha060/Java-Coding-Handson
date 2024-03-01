package Java_Coding_Revision_QA;

import java.util.Scanner;

public class Factorial_Demo {

	public static void main(String[] args) {

		System.out.println("-----Enter the number------");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("---Factorial of " + num + " is---->" + fact);

	}

}
