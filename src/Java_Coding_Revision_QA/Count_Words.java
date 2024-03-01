package Java_Coding_Revision_QA;

public class Count_Words {

	public static void main(String[] args) {

		String str = "Java is fun";

		// Method-1

		String arr[] = str.split(" ");

		System.out.println("No of Words Are------" + arr.length);

		// Method-2
		int count = 1;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				count++;
			}

		}

		System.out.println("No of Words Are------" + count);

	}

}
