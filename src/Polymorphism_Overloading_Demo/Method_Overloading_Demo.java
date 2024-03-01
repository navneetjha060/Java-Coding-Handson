package Polymorphism_Overloading_Demo;

public class Method_Overloading_Demo {

	public static void main(String[] args) {

		Method_Overloading_Demo md = new Method_Overloading_Demo();
		md.login("Navneet", "Demo123");
		md.login(990063245);
	}

	public void login(String uname, String pass) {
		System.out.println("Logged in using uername and password ");
	}

	public void login(long phoneNum) {
		System.out.println("Logged in using phone number ");
	}

}
