package Java_Coding_Revision_QA;

import java.util.Arrays;

public class Equality_Of_Arrays {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 10, 20, 30, 40, 50 };
		Equality_Of_Arrays E = new Equality_Of_Arrays();
		E.MethodOne(a, b);
		E.MethodTwo(a, b);

	}

	public void MethodOne(int a[], int b[]) {

		boolean flag = Arrays.equals(a, b);

		if (flag == true) {
			System.out.println("-----Arrays are equal------");
		}

		else {
			System.out.println("-----Arrays are not equal------");
		}

	}

	public void MethodTwo(int a[], int b[]) {

		boolean flag = true;
		if (a.length != b.length) {
			System.out.println("-----Arrays are not equal------");
		}

		else {

			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {
					System.out.println("-----Arrays are not equal------");
					flag = false;
					break;
				}

			}

			if (flag == true) {
				System.out.println("-----Arrays are equal------");
			}

		}

	}

}
