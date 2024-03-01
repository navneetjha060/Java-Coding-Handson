package Java_Coding_Revision_QA;

import java.util.Scanner;

public class Count_no_of_digits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Enter the number-------");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
		}
		
		System.out.println("No of digits are-----"+count);

	}

}
