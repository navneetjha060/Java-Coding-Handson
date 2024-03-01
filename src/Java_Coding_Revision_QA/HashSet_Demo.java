package Java_Coding_Revision_QA;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.remove(50);

		System.out.println(hs);

		for (Integer s : hs) {
			System.out.println("Values are------> " + s);
		}

		System.out.println("=========================");
		System.out.println("=========================");

		Iterator<Integer> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println("Values are------> " + itr.next());
		}

	}

}
