package Java_Coding_Udemy;

import java.util.Scanner;

public class Prime_Check {

	public static void main(String[] args) {

		System.out.println("Enter the Number ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		primeCheck(num);

	}

	public static void primeCheck(int num) {

		int count = 0;
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("Number is Prime");
		}

		else {
			System.out.println("Number is not Prime");
		}

	}

}
