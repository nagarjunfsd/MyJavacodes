
public class Swaping {

	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("Before swapping values are:"  +a+"  "  +b);
		
	/*	//Method 1
		int c;
		c=a;
		a=b;
		b=c; */
		
		//Method 2
		a=a+b;     //10+20=30
		b=a-b;     //30-20=10
		a=a-b;     //30-10
			

		System.out.println("After swapping values are:"  +a+"  "  +b);
	}

}
