package Variable1;

public class Demo4 
{
	public static void main(String[] args)
	{
		//Variable Declaration
		
		String EmployeeName;
		int EmployeeID;												
		String EmployeeCompany;								//Data Type Variable Name
		char EmployeeSection;							
		long EmployeeMoNo;
		float EmployeeSalary;
		
		//Assign Value 
		
		EmployeeName = "Samarth Khade";
		EmployeeID = 20249;
		EmployeeCompany = "Infosys";					//Variable Name Variable Value
		EmployeeSection = 'B';
		EmployeeMoNo = 9625438425L;
		EmployeeSalary= 67000.25F;
		
		//Use Variable
		
		System.out.println("Employee Name: "+ EmployeeName);
		System.out.println("Employee ID: " + EmployeeID);			//Info Reuse
		System.out.println("Employee Company: " + EmployeeCompany);
		System.out.println("Employee Section: " + EmployeeSection);
		System.out.println("Employee MoNo: " + EmployeeMoNo);
		System.out.println("Employee Salary: " + EmployeeSalary);
		
		
		
	}

}
