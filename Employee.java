public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
		System.out.println("----------------------------------------------");

		// Used Math.random()*2 to get two values i.e., 0 and 1
		int attendance = (int) (Math.random() * 2);

		// For checking if Employee is present or not
		if (attendance == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}

	}

}

