package Java_Coding_Revision_QA;

public class Break_Continue_Demo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			
			if (i == 5) {
				continue;
			}

			if (i == 9) {
				break;
			}
			
			System.out.println(i);

		}

	}

}
