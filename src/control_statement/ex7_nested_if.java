package control_statement;

public class ex7_nested_if 
{
	public static void main(String[] args) 
	{
		int PEM=400;
		int MEM=750;
		
		   //400>=350
		if(PEM>=350)			//outer if 
		{
			System.out.println("Eligible for main exam");
			
			// 800>=800
			if(MEM>=800)		//inner/nested if
			{
				System.out.println("Got selected");
			}
			else
			{
				System.out.println("Rejected from main exam");
			}
		}
		else 
		{
			System.out.println("Not Eligible for MAIN exam");
		}
		
	}

}
