package Exception_Handling;

public class example11 
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		try
		{
			System.out.println(s1.charAt(8)); 					//risky code
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException Handled");		//failure msg
		}
		finally
		{
			System.out.println("running finally block");
		}
		
		System.out.println("Hii");
		System.out.println("Hellow");
	}
}
