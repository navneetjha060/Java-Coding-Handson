package Java_Coding_Revision_QA;

public class Even_Odd_Numbers_Array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("------Even Numbers Are-------");
		for (int i : arr) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

		System.out.println("------Odd Numbers Are-------");
		for (int i : arr) {

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

	}

}
