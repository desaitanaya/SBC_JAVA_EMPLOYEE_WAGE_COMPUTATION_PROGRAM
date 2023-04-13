public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
		System.out.println("----------------------------------------------");

		// Used Math.random()*2 to get two values i.e., 0 and 1
		int attendance = (int) (Math.random() * 2);
		
		// Constant variables
		final int full_day_hour = 8;
		final int wage_per_hour = 20;

		// Initializing the variable
		int salary = 0;

		// For checking if Employee is present or not
		if (attendance == 1) {
			// Calculating the salary is Employee is Present
			salary = full_day_hour * wage_per_hour;
			System.out.println("Employee is Present for Full time and the Salary is : " + salary);
		} 
		else {
			System.out.println("Employee is Absent and the Salary is : " + salary);
		}

	}

}
