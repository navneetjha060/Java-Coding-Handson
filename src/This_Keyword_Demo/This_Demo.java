package This_Keyword_Demo;

public class This_Demo {

	int a = 10;
	int b = 20;

	public static void main(String[] args) {

		This_Demo td = new This_Demo();
		td.getData();
	}

	public void getData() {

		int a = 100;
		int b = 200;

		System.out.println(a + b);

		System.out.println(this.a + this.b);
	}

}
