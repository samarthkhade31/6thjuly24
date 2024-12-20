package Generalization;
//IC2
public class CurrentAcc implements BankAcc 
{
	public void CD() 
	{
		System.out.println("CD: 11L");
	}
	
	public void CW() 
	{
		System.out.println("CW: 6L");
	}
	
	public void MT()
	{
		System.out.println("MT: 2L");
	}
	
	public void newfeatureB() 
	{
		System.out.println("newFeatures: B");
	}
}
