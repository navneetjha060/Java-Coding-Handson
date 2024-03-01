package Java_Coding_Revision_QA;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java_Streams {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Ravi");
		names.add("Navneet");
		names.add("Ashish");
		names.add("Ana");
		names.add("Jhon");

		int count = 0;

		// Approach-1
		for (int i = 0; i < names.size(); i++) {

			String actual = names.get(i);

			if (actual.startsWith("A")) {
				count++;
				System.out.println(actual);
			}

		}

		System.out.println("Words starting with A are " + count);

		// Approach-2 (Using Streams and Lambda Expression)

		long count2 = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println("Words starting with A are using Streams and Lambda Exspression are " + count2);

		// Print names whose length is greater than 4
		System.out.println("Fetching names whose length is greater than 4 using Streams and Lambda Exspression ");
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

		System.out.println("Print names which start with A in upper case ");
		names.stream().filter(s -> s.startsWith("A")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		System.out.println("Print names which start with A in upper case and in Sorted Order ");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("Verify Navneet is present in list ");
		Boolean flag = names.stream().anyMatch(s -> s.equalsIgnoreCase("Navneet"));
		System.out.println(flag);

		System.out.println("Get a List of names starting with A ");
		List<String> Res = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
		System.out.println(Res);

		// Print unique numbers
		// Sort the array
		// Sort and give 3rd index value

		System.out.println("Print unique numbers from array ");
		List<Integer> Values = Arrays.asList(2, 2, 4, 4, 5, 6, 7, 1);
		Values.stream().distinct().forEach(s->System.out.println(s));
		
		System.out.println("Sorted the Array ");
		Values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		System.out.println("Sort and give 3rd index value ");
		List<Integer> Res2 = Values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(Res2.get(2));

	}

}
