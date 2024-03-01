package Java_Coding_Udemy;

public class Min_Max_MultiD_Array {

	public static void main(String[] args) {

		int arr[][] = { { 2, 4, 5 }, { 1, 5, 8 }, { 6, 10, 20 } };

		int max = 0;
		int min = arr[0][0];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] > max) {
					max = arr[i][j];
				}

				if (arr[i][j] < min) {
					min = arr[i][j];
				}

			}

		}

		System.out.println("Maximum value is " + max);
		System.out.println("Minimum value is " + min);

	}

}
