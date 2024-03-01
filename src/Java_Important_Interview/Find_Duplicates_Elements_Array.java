package Java_Important_Interview;

import java.util.HashMap;
import java.util.HashSet;

public class Find_Duplicates_Elements_Array {

	public static void main(String[] args) {

		String arr[] = { "Java", "Python", "C++", "Java" };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {
					System.out.println("Duplicate Found  " + arr[i]);
				}
			}

		}

		// Using HashSet

		HashSet<String> hs = new HashSet<String>();

		for (String s : arr) {

			if (hs.add(s) == false) {
				System.out.println("Duplicate Found " + s);
			}

		}

		// Using HashMap

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String s : arr) {

			if (hm.containsKey(s) == false) {
				hm.put(s, 1);
			}

			else {
				hm.put(s, hm.get(s) + 1);
			}

		}
		
		for(String k : hm.keySet()) {
			
			if(hm.get(k)>1) {
				System.out.println("Duplicate Found "+k);
			}
		}
		
		

	}

}
