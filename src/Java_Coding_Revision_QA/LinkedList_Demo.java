package Java_Coding_Revision_QA;

import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String[] args) {

		LinkedList<Integer> Ls = new LinkedList<Integer>();

		Ls.add(100);
		Ls.add(200);
		Ls.add(300);
		Ls.add(400);
		Ls.add(400);

		System.out.println(Ls);
		System.out.println(Ls.add(400));
		
		for(Integer x : Ls) {
			System.out.println(x);
		}

	}

}
