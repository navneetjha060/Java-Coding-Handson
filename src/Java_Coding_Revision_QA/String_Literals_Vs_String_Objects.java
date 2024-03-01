package Java_Coding_Revision_QA;

public class String_Literals_Vs_String_Objects {

	public static void main(String[] args) {

		// String Literals
		String S1 = "Hello";
		String S2 = "Hello";

		// String Objects
		String S3 = new String("Hello");

		System.out.println(S1 == S2);
		System.out.println(S1 == S3);
		System.out.println(S1.equals(S3));

	}

}
