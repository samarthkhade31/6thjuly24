package StarPattern;

public class Pattern4
{
	public static void main(String[] args)
	{
//		*****
//		*****
//		*****
//		*****
		for(int i=1; i<=4; i++)					//outer for loop -> rows
		{
			for(int j=1; j<=5; j++)				//inner for loop -> colns
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
