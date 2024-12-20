package Exception_Handling;

public class example8 
{
	public static void main(String[] args) 
	{
		String s1 = "velocity";
		
		try 
		{
			System.out.println(s1.charAt(9));		//risky code
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception handled");
		}
		
		System.out.println("Hiii");
	}
}
