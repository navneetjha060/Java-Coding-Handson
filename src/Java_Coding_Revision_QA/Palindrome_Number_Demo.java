package Java_Coding_Revision_QA;

import java.util.Scanner;

public class Palindrome_Number_Demo {

	public static void main(String[] args) {

		System.out.println("-------Enter the number------>");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		if (rev == original) {
			System.out.println("--------Number is Palindrome------");
		}

		else {
			System.out.println("--------Number is not Palindrome------");
		}

	}

}
