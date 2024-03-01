package Java_Coding_Revision_QA;

import java.util.Scanner;

public class Largest_Of_Three_Numbers {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ");
		int a = sc.nextInt();

		System.out.println("Enter Second Number ");
		int b = sc.nextInt();

		System.out.println("Enter Third Number ");
		int c = sc.nextInt();

		Largest_Of_Three_Numbers Largest = new Largest_Of_Three_Numbers();
		Largest.methodOne(a, b, c);
		Largest.methodTwo(a, b, c);
	}

	public void methodOne(int x, int y, int z) {

		if (x > y && x > z) {
			System.out.println("Largest Number is----> " + x);
		}

		else if (y > x && y > z) {
			System.out.println("Largest Number is----> " + y);
		}

		else {
			System.out.println("Largest Number is----> " + z);
		}

	}

	public void methodTwo(int x, int y, int z) {

		int Large1 = x > y ? x : y;
		int Large2 = z > Large1 ? z : Large1;
		System.out.println("Largest Number is----> " + Large2);
	}

}
