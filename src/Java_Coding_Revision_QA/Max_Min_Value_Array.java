package Java_Coding_Revision_QA;

public class Max_Min_Value_Array {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		int max = arr[0];
		int min = arr[0];

		for (int x : arr) {

			if (x > max) {
				max = x;
			}

			if (x < min) {
				min = x;
			}

		}

		System.out.println("Maximum value is ------> " + max);
		System.out.println("Minimum value is ------> " + min);

	}

}
