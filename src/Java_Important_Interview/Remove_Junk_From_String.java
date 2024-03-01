package Java_Important_Interview;

public class Remove_Junk_From_String {

	public static void main(String[] args) {

		String s = " Navneet ##### Jha Java Concepts ****";

		String s1 = s.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(s1);

		String s2 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);

	}

}
