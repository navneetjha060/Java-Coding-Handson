package Java_Important_Interview;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		
		int num=153;
		int temp = num;
		int temp2;
		int temp3=0;
		
		//153 -> 1^3+5^3+3^3 = 153
		
		while(num!=0) {
			
			int r = num%10;
			temp2=r*r*r;
			
			temp3=temp3+temp2;
			num=num/10;
			
			
		}
		
		System.out.println(temp3);
		
		if(temp3==temp) {
			System.out.println("Armstrong");
		}
		
		else {
			System.out.println("Not Armstrong");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
