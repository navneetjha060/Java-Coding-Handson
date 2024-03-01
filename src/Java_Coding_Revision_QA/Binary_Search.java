package Java_Coding_Revision_QA;

import java.util.Arrays;

public class Binary_Search {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		int key = 100;

		int L = 0;
		int H = arr.length - 1;
		int M;
		boolean flag = false;

		while (L <= H) {

			M = (H + L) / 2;

			if (key == arr[M]) {
				System.out.println("Match found at pos. " + (M + 1));
				flag = true;
				break;
			}

			else if (key < arr[M]) {

				H = M - 1;

			}

			else if (key > arr[M]) {

				L = M + 1;

			}

		}

		if (flag == false) {
			System.out.println("Element match is not found");
		}

		System.out.println(Arrays.binarySearch(arr, 40));

	}

}
