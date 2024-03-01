package Java_Coding_Revision_QA;

public class Remove_Junk {

	public static void main(String[] args) {

		String s = "Navneet Jha %%";

		String s2 = s.replaceAll("%%", "");

		System.out.println(s2);

	}

}
