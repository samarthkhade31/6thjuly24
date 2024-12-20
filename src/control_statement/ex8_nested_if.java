package control_statement;

public class ex8_nested_if 
{
	public static void main(String[] args) 
	{
		int SA=6000;
		
		//6000>=500
		if (SA>=500)			//outer if    SA=Shoping Amount
		{
			System.out.println("free delivery");
			
			//6000>=5000
			if (SA>=5000)			//inner if 
			{
				System.out.println("additional 10% discount");
			}
			else
			{
				System.out.println("No additional discount");
			}
		}
		else
		{
			System.out.println("50 rs charges applied");
		}
		
	}

}
