package StarPattern;

public class Pattern3
{
	public static void main(String[] args) 
	{
		//***
		//***
		
		for(int i=1; i<=2; i++)			//outer for loop ->rows
		{
			for(int j=1; j<=3; j++)		//inner for loop -> colns
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
