
public class Replace_numbers {

	public static void main(String[] args) {
		
		int numbers[] = {12,34,22,11,17,27,29,42,100};
        replaceEvenWithZero(numbers);
        
        System.out.print("{");
         for(int i=0; i<numbers.length; i++) {
        	System.out.print(numbers[i]);
        	if(i<numbers.length-1) {
        	System.out.print(" , ");
        	
         }
         }
         System.out.println("}");	
	}

	private static void replaceEvenWithZero(int[] arr) {
		for(int i=0;i<arr.length; i++) {
			if( arr[i]%2==0) {
				arr[i]=0;
			}
		}
		
	}
}
        	
        	
        	
        	
        	
        	
        	
	


 