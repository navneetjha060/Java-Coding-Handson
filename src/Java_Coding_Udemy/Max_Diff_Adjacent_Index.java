package Java_Coding_Udemy;

public class Max_Diff_Adjacent_Index {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 10, 15, 20, 100 };

		int max=0;
		for (int i = 0; i < arr.length-1; i++) {

			int diff = arr[i + 1] - arr[i];

			if(diff>max) {
				max=diff;
			}
			System.out.println(diff);

		}
		
		System.out.println("Maximum diff btw adjacent index is "+max);

	}

}
