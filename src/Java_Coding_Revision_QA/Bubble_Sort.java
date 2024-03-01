package Java_Coding_Revision_QA;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {

		int arr[] = { 10, 30, 20, 50, 40 };

		System.out.println("---Array before sorting----" + Arrays.toString(arr));

		int n = arr.length;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n-1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

		System.out.println("---Array after sorting----" + Arrays.toString(arr));

	}

}
