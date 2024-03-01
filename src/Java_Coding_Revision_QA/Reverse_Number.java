package Java_Coding_Revision_QA;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {

		System.out.println("Please enter the number------> ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		Reverse_Number R = new Reverse_Number();
		R.revMethodOne(num);
		R.revMethodTwo(num);
		R.revMethodThree(num);

	}

	public void revMethodOne(int num) {

		int rev = 0;
		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverese Number is --------> " + rev);

	}

	public void revMethodTwo(int num) {

		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println("Reverese Number is --------> " + sb.reverse());

	}

	public void revMethodThree(int num) {

		StringBuilder sb = new StringBuilder(String.valueOf(num));
		System.out.println("Reverese Number is --------> " + sb.reverse());
	}

}
