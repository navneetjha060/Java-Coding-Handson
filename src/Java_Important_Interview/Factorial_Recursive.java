package Java_Important_Interview;

public class Factorial_Recursive {

	public static void main(String[] args) {

		int fact = findFact(8);
		System.out.println(fact);

	}

	public static int findFact(int num) {

		if (num <= 1) {
			return 1;
		}

		else {
			return num * findFact(num - 1);
		}

	}

}
