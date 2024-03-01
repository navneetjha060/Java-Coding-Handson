package Java_Coding_Revision_QA;

import java.util.HashSet;

public class Find_Duplicate_Elements_Array {

	public static void main(String[] args) {

		String arr[] = { "Java", "C++", "Python", "java", "c++" };
		Find_Duplicate_Elements_Array Dup = new Find_Duplicate_Elements_Array();
		Dup.methodOne(arr);
		Dup.methodTwo(arr);

	}

	public void methodOne(String a[]) {

		boolean flag = true;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println("----Duplicate found-----> " + a[i]);
					flag = false;
				}
			}

		}

		if (flag == true) {
			System.out.println("----No Duplicates Found-----");
		}

	}

	public void methodTwo(String a[]) {

		HashSet<String> hs = new HashSet<String>();
		boolean flag = true;

		for (String s : a) {

			if (!hs.add(s)) {
				System.out.println("----Duplicate found-----> " + s);
				flag = false;
			}

		}

		if (flag == true) {
			System.out.println("----No Duplicates Found-----");
		}

	}

}
