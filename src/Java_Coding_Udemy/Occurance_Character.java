package Java_Coding_Udemy;

public class Occurance_Character {

	public static void main(String[] args) {

		String s = "Navneet";
		char c = 'e';
		int res = count(s,c);
		System.out.println(c+" Occured "+res+" times in "+s);
		

	}

	public static int count(String s, char c) {

		int temp=0;
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)==c) {
				temp++;
			}
		}
		
		return temp;

	}

}
