
public class Incremental {

	public static void main(String[] args) {
		
		int salary = 100;
		System.out.println("Salary of the Person:" + salary);
		
		salary++;//101
		System.out.println("Salary of the Person:" + salary);

		salary += 100;
		System.out.println("Salary of the Person:" + salary);
		
		salary--;
		System.out.println("Salary of the Person:" + salary);
	}

}
