import java.util.Scanner;

public class EmployeeDriverClass
{

	public static void main(String[] args) 
	{
		 String name;
		 String address;
		 String dateOfBirth;
		 String dateHired;
		 long salary;
		 
		 Scanner readInput = new Scanner(System.in);
		 Employee newEmployee = new Employee();
		 System.out.println("Please Enter the Name of the New Employee : ");
		 name = readInput.next();
		 newEmployee.name = name;
		 
		 System.out.println("Please Enter the New Employee's Address: ");
		 address = readInput.next();
		 newEmployee.address = address;
		 
		 System.out.println("Please Enter the  New New Employee's Date of Birth (MM/dd/yyyy): ");
		 dateOfBirth = readInput.next();
		 newEmployee.dateOfBirth = dateOfBirth;
		 System.out.println("You entered: "+newEmployee.birthDate());
		 
		 System.out.println("\nPlease the Date that the New Employee is Hired (MM/dd/yyyy): ");
		 dateHired = readInput.next();
		 newEmployee.dateHired = dateHired;
		 System.out.println("You entered: "+newEmployee.hireDate());
		 
		 System.out.println("\nPlease Enter the New New Employee's Yearly Salary: ");
		 salary = readInput.nextLong();
		 newEmployee.salary = salary;

		 newEmployee.info();
		 
		 readInput.close();		 
	}

}
