package Java_Coding_Revision_QA;

import java.util.Random;

public class Random_Demo {

	public static void main(String[] args) {

		Random ran = new Random();
		System.out.println("<---------Random Number Demo------->");

		System.out.println(ran.nextInt(500));
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextDouble());
		System.out.println(Math.random());

	}

}
