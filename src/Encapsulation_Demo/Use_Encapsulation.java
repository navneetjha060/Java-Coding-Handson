package Encapsulation_Demo;

public class Use_Encapsulation {

	public static void main(String[] args) {

		Encapsulation_Class EC = new Encapsulation_Class();

		EC.setLength(200);
		int L = EC.getLength();

		System.out.println(L);

	}

}
