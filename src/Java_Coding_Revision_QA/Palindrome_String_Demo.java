package Java_Coding_Revision_QA;

import java.util.Scanner;

public class Palindrome_String_Demo {

	public static void main(String[] args) {

		System.out.println("-----Enter the Word----->");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}

		if (s.equalsIgnoreCase(rev)) {
			System.out.println("---------Word is Palindrome-------");
		}

		else {
			System.out.println("---------Word is not Palindrome-------");
		}

	}

}
