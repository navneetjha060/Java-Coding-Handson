package Java_Coding_Revision_QA;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Data_To_File {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Eclipse Workspace\\Java_Coding_Revision\\src\\Others\\Demo.txt";

		FileWriter fw = new FileWriter(path);

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Sample Line");

		bw.close();

	}

}
