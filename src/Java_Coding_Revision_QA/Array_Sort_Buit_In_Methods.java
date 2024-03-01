package Java_Coding_Revision_QA;

import java.util.Arrays;
import java.util.Collections;

public class Array_Sort_Buit_In_Methods {

	public static void main(String[] args) {

		int arr1[] = { 10, 20, 40, 30, 60, 50 };

		for (int x : arr1) {
			System.out.println(x);
		}

		System.out.println("Array values before sorting " + Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Array values after sorting " + Arrays.toString(arr1));

		Arrays.parallelSort(arr1);
		System.out.println("Array values after parallel sorting " + Arrays.toString(arr1));

		Integer arr2[] = { 10, 20, 40, 30, 60, 50 };
		System.out.println("Array values before sorting " + Arrays.toString(arr2));
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println("Array values after Reverse sorting " + Arrays.toString(arr2));

	}

}
