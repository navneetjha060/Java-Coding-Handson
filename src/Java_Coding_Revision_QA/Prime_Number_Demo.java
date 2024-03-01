package Java_Coding_Revision_QA;

import java.util.Scanner;

public class Prime_Number_Demo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("-------Enter any Number--------->");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("-------Number is Prime--------");
		}

		else {
			System.out.println("-------Number is not Prime--------");
		}

	}

}
