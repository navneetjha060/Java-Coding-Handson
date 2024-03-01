package Java_Coding_Revision_QA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_Data_From_File {

	public static void main(String[] args) throws FileNotFoundException {

		String Path = System.getProperty("user.dir");

		File F = new File(Path + "\\src\\Others\\Demo.txt");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(F);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
