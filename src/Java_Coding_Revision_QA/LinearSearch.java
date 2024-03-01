package Java_Coding_Revision_QA;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		int Key = 100;
		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == Key) {
				System.out.println("-------Element is found at index------> " + (i + 1));
				flag = false;
				break;

			}

		}

		if (flag == true) {
			System.out.println("--------Element is not found---------");
		}

	}

}
