package Java_Coding_Revision_QA;

public class Reverse_Each_Word_Of_String {

	public static void main(String[] args) {

		String str = "Hellow This is Demo Class";
		String arr[] = str.split(" ");
		String revWord = "";

		// Method One
		for (String s : arr) {

			String rev = "";
			for (int i = s.length() - 1; i >= 0; i--) {

				rev = rev + s.charAt(i);

			}

			revWord = revWord + rev + " ";

		}

		System.out.println("Reverse of each word is ------> " + revWord);

		// Method Two
		String revWord2 = "";
		for (String w : arr) {

			String rev = "";
			StringBuilder sb = new StringBuilder(w);
			rev = rev + sb.reverse();

			revWord2 = revWord2 + rev + " ";

		}

		System.out.println("Reverse of each word is ------> " + revWord2);

	}

}
