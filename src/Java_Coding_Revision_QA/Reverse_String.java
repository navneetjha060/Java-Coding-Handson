package Java_Coding_Revision_QA;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {

		System.out.println("Enter the Word-------> ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		Reverse_String RS = new Reverse_String();
		RS.reverseMethodOne(str);
		RS.reverseMethodTwo(str);
		RS.reverseMethodThree(str);
		RS.reverseMethodFour(str);

	}

	public void reverseMethodOne(String S) {

		String rev = "";
		for (int i = S.length() - 1; i >= 0; i--) {
			rev = rev + S.charAt(i);
		}

		System.out.println("Reversed Word is --------> " + rev);

	}

	public void reverseMethodTwo(String S) {

		StringBuffer SB = new StringBuffer(S);
		System.out.println("Reversed Word is --------> " + SB.reverse());

	}

	public void reverseMethodThree(String S) {

		StringBuilder SB = new StringBuilder(S);
		System.out.println("Reversed Word is --------> " + SB.reverse());

	}

	public void reverseMethodFour(String S) {

		String rev = "";
		char[] ch = S.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}

		System.out.println("Reversed Word is --------> " + rev);
	}

}
