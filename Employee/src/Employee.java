import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class Employee
{
	/*fields*/
	String name;
	String address;
	String dateOfBirth;
	String dateHired;
	long salary;
	
	/*Constructor*/
	public Employee(String name, String address, String dateOfBirth, 
			String dateOfHired, long salary)
	{
	this.name = name;
	this.address= address.toString();
	this.dateOfBirth = dateOfBirth;
	this.dateHired = dateOfHired;
	this.salary  = salary;
	}
	public Employee()
	{
		
	}
	/*Method to format the birthday date*/
	public Date birthDate()
	{
		 DateFormat formatBirdthdayDate = new SimpleDateFormat("MM/dd/yyyy");
		 Date birthDate= null;
		 
		 if(dateOfBirth!= null)
		 {
			 try 
			 {
				 birthDate = formatBirdthdayDate.parse(dateOfBirth);
			 }
		     catch (Exception e)
			 { 
				 System.out.println("Please Make sure that you have entred correct Birth date!");
			 }
		 }
		 
		 return birthDate;
	}
	
	/*Method to format date hired*/
	public Date hireDate()
	{
		DateFormat formatDateHired = new SimpleDateFormat("MM/dd/yyyy");
		Date hireDate= null;
		
		if(dateHired!=null)
		{
			try
			{ 
				hireDate = formatDateHired.parse(dateHired);
			}
			catch (Exception e)
			{ 
				System.out.println("Please Make sure that you have entred hiring date correctly...");
			}
		}
		
		return hireDate;
	}
	
	/*Method to display the info*/
	 public void info()
	 {
		 System.out.println("-------------------------------------------------------------");
		 System.out.println("The Data of the New Employee as Entered:");
		 System.out.println("Name : "+name);
		 System.out.println("Address : "+this.address);
		 System.out.println("DOB : " +birthDate());
		 System.out.println("Date Hired : "+hireDate());
		 System.out.println("Yearly Salary : " +salary);
		 System.out.println("-------------------------------------------------------------");
	 }

}
