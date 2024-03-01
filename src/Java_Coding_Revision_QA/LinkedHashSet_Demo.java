package Java_Coding_Revision_QA;

import java.util.LinkedHashSet;

public class LinkedHashSet_Demo {

	public static void main(String[] args) {

		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();

		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(400);

		System.out.println(hs);
		System.out.println(hs.add(400));

		for (Integer x : hs) {
			System.out.println(x);
		}

	}

}
