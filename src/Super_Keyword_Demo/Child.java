package Super_Keyword_Demo;

public class Child extends Parent {

	String Name = "Ravi";
	int ID = 400;

	public static void main(String[] args) {

		Child c = new Child();
		c.getData();
	}

	public void getData() {

		System.out.println(Name);
		System.out.println(ID);

		// refer immediate parent class instance variable
		System.out.println(super.Name);
		System.out.println(super.ID);

		// invoke immediate parent class method
		super.getData();

	}

}
