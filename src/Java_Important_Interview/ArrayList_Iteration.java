package Java_Important_Interview;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iteration {

	public static void main(String[] args) {

		ArrayList<String> AL = new ArrayList<String>();

		AL.add("Book1");
		AL.add("Book2");
		AL.add("Book3");
		AL.add("Book4");

		// Using Iterator
		System.out.println("Using Iterator ");
		Iterator<String> itr = AL.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Using Lambda
		System.out.println("Using Lambda Expression ");
		AL.stream().forEach(s -> System.out.println(s));

		// Using for each loop
		System.out.println("Using For Each Loop ");
		for (String k : AL) {
			System.out.println(k);
		}
		
		
		// Using For Loop
		System.out.println("Using For Loop ");
		for(int i=0;i<AL.size();i++) {
			System.out.println(AL.get(i));
		}
		

	}

}
