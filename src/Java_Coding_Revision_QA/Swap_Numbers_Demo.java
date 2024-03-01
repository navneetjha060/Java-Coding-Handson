package Java_Coding_Revision_QA;

public class Swap_Numbers_Demo {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp;

		System.out.println("------Values Before Swaping------");
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("------Values After Swaping------");
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);

	}

}
