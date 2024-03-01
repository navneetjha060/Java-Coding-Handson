package Java_Important_Interview;

public class Final_Finally_Finalize {

	public static void main(String[] args) {

		final int a = 10; // Make a constant

		System.out.println(a);
		test();

	}

	public static void test() {

		int a = 10;

		try {

			System.out.println(a / 0);

		}

		catch (Exception e) {
			System.out.println("Inside Catch Block ");
		}

		// This will always be executed
		finally {
			System.out.println("This will always be executed ");
		}
		
		//The finalize method in java is called by the garbage collector before an object is garbage collected. 
		//This method can be used to perform any necessary cleanup before the object is destroyed.

	}

}
