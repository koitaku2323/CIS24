// Name: Ryan Yee
// Date: 6/28/19 
// Description: explain static variables
// File Name: Employee.java
// To Compile in terminal type: javac Employee. java
// To Run the program in terminal type: java Employee

class Employee
{
	static int numberEmployees; // static variable changes it for all instances, changes
	int idNumber; // instance variable - each instance has its own idNumber

	Employee(int newID)
	{
		idNumber = newID;
		numberEmployees++; // changing static variable changes it for all instances
	}

	public String toString()
	{
		return "idNumber = " + idNumber + ", numberEmployees = " + numberEmployees;
	}

	public static void main(String[] args)
	{
		System.out.println("The value of numberEmployees = " + Employee.numberEmployees);
		// Notice above how numberEmployees can be "seen" and "used"
		// before we have created any instances below (employees_one and employee_two)
		Employee employee_one = new Employee(123);
		Employee employee_two = new Employee(456);
		Employee employee_three = new Employee(789);
		//       ^^^^^^^^^^^^^^INSTANCES / OBJECTS of the Employee TYPE / CLASS

		// Notice how both employee_one and employee_two have the same value for numberEmployees?
		// This is because numberEmployees is a static variable and is "shared" between all instances
		// If one instance changes the static variable,
		// then the static variable value changes for all other instances:
		System.out.println("employee_one = " + employee_one);
		System.out.println("employee_two = " + employee_two);
		System.out.println("employee_three = " + employee_three);
	}
}
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Employee.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Employee
The value of numberEmployees = 0
employee_one = idNumber = 123, numberEmployees = 3
employee_two = idNumber = 456, numberEmployees = 3
employee_three = idNumber = 789, numberEmployees = 3
*/