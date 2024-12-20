package Exception_Handling;

public class example6 
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
			System.out.println("Arithmetic Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBoundsException handled");		//failure msg
		}
		System.out.println("hiii");
	}
}
