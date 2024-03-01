package Java_Coding_Revision_QA;

public class Sum_of_Elements_Array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}

		for (int x : arr) {
			sum2 = sum2 + x;
		}

		System.out.println("Sum of elements are ------> " + sum1);
		System.out.println("Sum of elements are ------> " + sum2);

	}

}
