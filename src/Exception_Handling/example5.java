package Exception_Handling;

public class example5
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		

		try
		{
			System.out.println(s1.charAt(9));		//risky code
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");   //failure msg
		}
		
		System.out.println("hellow");
		System.out.println("abcd");
	}
}
