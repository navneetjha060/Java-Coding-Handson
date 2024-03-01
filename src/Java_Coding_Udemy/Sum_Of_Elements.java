package Java_Coding_Udemy;

public class Sum_Of_Elements {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int sum = sumMethod(arr);

		System.out.println("Sum of Elements are " +sum);

	}

	public static int sumMethod(int arr[]) {

		int sum = 0;
		for (int x : arr) {
			sum = sum + x;
		}

		return sum;

	}

}
