package Java_Coding_Revision_QA;

public class Try_Catch_Demo {

	public static void main(String[] args) {

		try {
			int a = 10;
			System.out.println("Before Division value is " + a);
			System.out.println(a / 0);
		}

		catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.getCause());
		}

		finally {
			System.out.println("This is always executed ");
		}

		System.out.println("After Division");

	}

}
