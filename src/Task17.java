
public class Task17 {

	public static void main(String[] args) {
		
		String fName = "Anna";
		String lName = "Suresh";
		long phone = 987654321L;
		String role = "Manage_yearsr";
		int age_years = 61;
		int dailyWorkingHours = 10;
		float salary_Year = 3450000F;
		int totalWorkingDays = 262;
		int leaves = 10;
	    CharSequence gender = "M";

System.out.println("Full Name:" + fName + lName);
System.out.println("Gender:" + gender);	     
System.out.println("Age in Months:" + age_years*12);	

    if(age_years<60) {
    	System.out.println("Senior Citizen is False");
    }else {
          System.out.println("Senior Citizen is True");		
		
    }
    System.out.println("Age in Weeks:" + age_years*52);
    System.out.println("Noof Days Present:" + (totalWorkingDays-leaves));
    System.out.println("Total Hours Worked :" + (totalWorkingDays-leaves)*10);
    System.out.println("Salary Deductions per Day :"  + salary_Year/262);
    System.out.println("Total Salary Deduction:" + (salary_Year/262)*10);
    System.out.println("Final Paid Salary:" + (salary_Year - (salary_Year/262)) *10);
	
	
}
}
