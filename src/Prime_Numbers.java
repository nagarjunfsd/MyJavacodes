
public class Prime_Numbers {

	public static void main(String[] args) {
       
		int n=50;
		int total=0;
		for(int i=2;i<=50;i++) {
			int count=0;
			 for(int j=2;j<i;j++) {
					if(i%j==0) {				
					 count++;
			}
		}
		if(count==0) {
			total++;
			System.out.print(i+ "  ");
			
	}
	}
		System.out.println("Totalprime numbers are:" +total);
	}
	}


