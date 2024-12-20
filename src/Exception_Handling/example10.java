package Exception_Handling;

public class example10
{
	public static void main(String[] args) 
	{
		String ar [] = {"abc", "xyz", "pqr"};
		String s1 = "velocity";
		
		try
		{
			try
			{
				System.out.println(ar[8]);    //inner try block risky code
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("inner try block code handled");
			}
			System.out.println(s1.charAt(8));       //outer try block risky code
		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("outer try block code handled");
		}
		System.out.println("Hiii");
	}
}
