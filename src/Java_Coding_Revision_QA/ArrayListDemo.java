package Java_Coding_Revision_QA;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> AL = new ArrayList<Object>();

		AL.add("Ravi");
		AL.add(10);
		AL.add(10);
		AL.add(true);
		AL.add(true);
		System.out.println(AL);
		System.out.println(AL.size());

		AL.remove(true);
		AL.remove(0);
		System.out.println(AL);
		System.out.println(AL.size());

		AL.get(2);
		AL.add(100);
		AL.add(false);
		AL.add("Test");

		System.out.println("====================================");

		for (int i = 0; i < AL.size(); i++) {
			System.out.println(AL.get(i));
		}

		System.out.println("====================================");

		for (Object obj : AL) {
			System.out.println(obj);
		}

		System.out.println("====================================");

		Iterator<Object> itr = AL.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
