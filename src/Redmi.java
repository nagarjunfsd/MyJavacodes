
public class Redmi {

	public static void main(String[] args) {
				String BranName = "Redmi";
				String version = "Mi Note 12";
				int memory_GB = 264;
				int Ram_GB = 8;
				String processor = "M2Chip";	
			    long screenresolution_height = 2796L;
		        long screenresolution_width = 1290L;
			 	double total_cost = 21000;
			 	String camera_mp = "5k"; 
			    int student_discount = 16;
			    double Discountprice = total_cost*0.16;
			    
System.out.println("Brand Name:" + BranName);
System.out.println("Version:" + version);			    
System.out.println("Ram:" + Ram_GB);			    
System.out.println("screenresolution_height:" + screenresolution_height);			    
System.out.println("screenresolution_width:" + screenresolution_width);			    
System.out.println("Phone Cost:" + total_cost);				
System.out.println("Camera Pixel:" + camera_mp);		
System.out.println("Phone Cost After Discount:" + (total_cost - Discountprice));		


	}

}
