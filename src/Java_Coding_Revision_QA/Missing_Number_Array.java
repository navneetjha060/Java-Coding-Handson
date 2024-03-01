package Java_Coding_Revision_QA;

public class Missing_Number_Array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5 };

		int sum1 = 0;
		for (int x : arr) {
			sum1 = sum1 + x;
		}

		System.out.println(sum1);

		int sum2 = 0;
		for (int i = 1; i <= 5; i++) {
			sum2 = sum2 + i;
		}

		System.out.println(sum2);

		System.out.println("----------Missing number is --------> " + (sum2 - sum1));

	}

}
