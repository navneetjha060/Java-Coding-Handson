package Java_Coding_Udemy;

import java.util.HashMap;

public class Print_Unique_Numbers_Array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 3, 3, 4, 5 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i : arr) {

			if (!hm.containsKey(i)) {
				hm.put(i, 1);
			}

			else {
				hm.put(i, hm.get(i) + 1);
			}

		}

		System.out.println(hm);
		
		for(Integer x : hm.keySet()) {
			
			if(hm.get(x)>1) {
				System.out.println("Duplicate values is "+x);
			}
		}

	}

}
