package Java_Coding_Revision_QA;

public class Count_Occurrences_Character {

	public static void main(String[] args) {

		String str = "Java is Fun";

		int L1 = str.length();
		System.out.println(str);

		String str2 = str.replaceAll("a", "");
		int L2 = str2.length();
		System.out.println(str2);
		int res = L1 - L2;
		System.out.println("Letter a occured-------" + res + " Times");

	}

}
