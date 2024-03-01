package Java_Coding_Udemy;

import java.util.ArrayList;

public class CompareAndCreateArray {

	public static void main(String[] args) {
		
		// Match index of both arrays and create a new array for matching values
		// Output array should have values {4,5}
		
		int a[] = {1,4,5,8};
		int b[] = {6,4,5,9};
		ArrayList<Integer> AL = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==b[i]) {
				AL.add(a[i]);
			}
		}
		
		
		Object[] obj = AL.toArray();
		
		for(Object o : obj) {
			System.out.println(o);
		}
		
		

	}

}
