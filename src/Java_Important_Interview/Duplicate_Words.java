package Java_Important_Interview;

import java.util.HashMap;

public class Duplicate_Words {

	public static void main(String[] args) {

		getDuplicate("This is Navneet Java Java");
		getDuplicate("This is Navneet Jha");

	}

	public static void getDuplicate(String S) {

		String arr[] = S.split(" ");

		// Using HashMap

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String k : arr) {

			if (hm.containsKey(k) == false) {
				hm.put(k, 1);
			}

			else {
				hm.put(k, hm.get(k) + 1);
			}

		}

		boolean flag = true;
		for (String h : hm.keySet()) {

			if (hm.get(h) > 1) {
				System.out.println("Duplicate Found " + h);
				flag = false;
				break;
			}

		}

		if (flag == true) {
			System.out.println("No Duplicate Found");
		}
	}

}
