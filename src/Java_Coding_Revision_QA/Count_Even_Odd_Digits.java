package Java_Coding_Revision_QA;

import java.util.Scanner;

public class Count_Even_Odd_Digits {

	public static void main(String[] args) {

		int even = 0, odd = 0;
		System.out.println("Enter the number ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		while (num != 0) {

			int digit = num % 10;

			if (digit % 2 == 0) {
				even++;
			}

			else {
				odd++;
			}

			num = num / 10;

		}

		System.out.println("No. of even digits are----" + even);

		System.out.println("No. of odd digits are----" + odd);

	}

}
