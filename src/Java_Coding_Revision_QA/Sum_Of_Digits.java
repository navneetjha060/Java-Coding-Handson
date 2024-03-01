package Java_Coding_Revision_QA;

import java.util.Scanner;

public class Sum_Of_Digits {

	public static void main(String[] args) {

		System.out.println("Enter the number------> ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		while (num != 0) {

			sum = sum + num % 10;
			num = num / 10;

		}

		System.out.println("Sum of digits are ------> " + sum);

	}

}
