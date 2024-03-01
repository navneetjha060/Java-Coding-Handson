package Java_Coding_Revision_QA;

public class Single_Dimensional_Array_Demo {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int arr2[] = new int[10];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;

		System.out.println(arr2.length);

		for (int i : arr2) {
			System.out.println(i);
		}

	}

}
