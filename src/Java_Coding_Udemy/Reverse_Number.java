package Java_Coding_Udemy;

public class Reverse_Number {

	public static void main(String[] args) {

		int num = 543;
		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		
		System.out.println("Reversed Number is "+rev);

	}

}
