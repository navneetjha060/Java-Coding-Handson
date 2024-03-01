package Java_Important_Interview;

public class String_Manipulation {

	public static void main(String[] args) {

		String s = "This is Navneet Jha";

		System.out.println(s.length());
		System.out.println(s.charAt(8));
		System.out.println(s.indexOf('N'));
		System.out.println(s.indexOf('i', 3));

		System.out.println(s.substring(5, 10));

		String s2 = "    Navneet Jha   ";
		System.out.println(s2.trim());

		String s3 = "01-01-1990";
		System.out.println(s3.replaceAll("-", "/"));

		String s4 = "This is Java Hands-on";
		String arr[] = s4.split(" ");

		for (String k : arr) {
			System.out.println(k);
		}

		String x = "Hello";
		String y = "World";
		int a = 100;

		int b = 200;

		System.out.println(x + y);   //HelloWorld
		System.out.println(a+b); //300 
		System.out.println(x+y+a+b); //HelloWorld100200 
		System.out.println(a+b+x+y); //300HelloWorld
		System.out.println(x+y+(a+b)); //HelloWorld300
		

	}

}
