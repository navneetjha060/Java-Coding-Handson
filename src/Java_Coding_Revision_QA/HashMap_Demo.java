package Java_Coding_Revision_QA;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap_Demo {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<>();
		hm.put("Key1", "Navneet");
		hm.put("Key2", "Jhon");
		hm.put("Key3", "Mike");
		hm.put("Key4", "Rhonda");
		hm.put("Key5", "Ravi");

		hm.remove("Key5");

		System.out.println(hm);

		for (String K : hm.keySet()) {

			System.out.println(K + "--------> " + hm.get(K));

		}

		System.out.println("===================================================");
		System.out.println("===================================================");

		Iterator<String> itr = hm.keySet().iterator();
		while (itr.hasNext()) {

			String K = itr.next();
			System.out.println(K + "--------> " + hm.get(K));
		}

	}

}
