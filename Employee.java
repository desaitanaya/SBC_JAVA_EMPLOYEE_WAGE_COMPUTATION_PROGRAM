public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
		System.out.println("----------------------------------------------");

		/*
		 * Used Math.random()*3 to get two values i.e., 0, 1 and 2 0 - Absent 1 -
		 * Present Full time 2 - Present Part time
		 */
		int attendance = (int) (Math.random() * 3);

		// Constant variables
		final int present_full_time = 1;
		final int present_part_time = 2;
		final int full_day_hour = 8;
		final int part_time_hour = 4;
		final int wage_per_hour = 20;

		// Initializing the variable
		int salary = 0;

		// For checking if Employee is present or not
		if (attendance == present_full_time) {
			// Calculating the salary is Employee is Present for Full time
			salary = full_day_hour * wage_per_hour;
			System.out.println("Employee is Present for Full time and the Salary is : Rs." + salary);
		} else if (attendance == present_part_time) {
			// Calculating the salary is Employee is Present for Part time
			salary = part_time_hour * wage_per_hour;
			System.out.println("Employee is Present for Part time and the Salary is : Rs." + salary);
		} else {
			System.out.println("Employee is Absent and the Salary is : Rs." + salary);
		}

	}

}
