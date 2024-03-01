package Java_Coding_Revision_QA;

public class Multidimensional_Array_Demo {

	public static void main(String[] args) {

		int arr[][] = new int[2][2];

		arr[0][0] = 2;
		arr[0][1] = 2;
		arr[1][0] = 2;
		arr[1][1] = 2;

		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2[i].length; j++) {

				System.out.print(arr2[i][j]+" ");
			}
			
			System.out.println();

		}

	}

}
