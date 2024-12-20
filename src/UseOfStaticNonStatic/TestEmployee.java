package UseOfStaticNonStatic;

public class TestEmployee 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.empName="Sam";				//objname.variablename=value
		e1.empId=101;
		//e1.empCEOname="abc";
		Employee.empCEOname="abc";
		
		
		Employee e2 = new Employee();
		e2.empName="Samar";
		e2.empId=102;
		//e2.empCEOname="abc";
		Employee.empCEOname="abc";
		
		
		Employee e3 = new Employee();
		e3.empName="Yash";
		e3.empId=103;
		//e3.empCEOname="xyz";
		Employee.empCEOname="xyz"; 
		
		
		e1.Employeeinfo();
		e2.Employeeinfo();
		e3.Employeeinfo();
	}

}
