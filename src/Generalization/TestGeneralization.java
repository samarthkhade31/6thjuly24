package Generalization;

public class TestGeneralization
{
	public static void main(String[] args)
	{
		System.out.println("Features of Saving Account: ");
		SavingAcc saving = new SavingAcc();
		saving.CD();
		saving.CW();
		saving.MT();
		saving.newfeatureA();
		
		System.out.println("Features of Current Account: ");
		CurrentAcc current=new CurrentAcc();
		current.CD();
		current.CW();
		current.MT();
		current.newfeatureB();
		
		System.out.println("Features of Salary Account: ");
		SalaryAcc salary = new SalaryAcc();
		salary.CD();
		salary.CW();
		salary.MT();

	}
	
	
}
