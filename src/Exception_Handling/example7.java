package Exception_Handling;

public class example7 
{
	public static void main(String[] args) 
	{
		String s1 = "velocity";
		
		try 
		{
			System.out.println(s1.charAt(9));		//risky code
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception handled");
			e.printStackTrace();
		}
		
		System.out.println("Hiii");
	}
}
