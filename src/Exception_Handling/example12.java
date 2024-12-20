package Exception_Handling;

public class example12

{
	public static void main(String[] args) 
	{
		String s1="velocity";
		try
		{
			System.out.println(s1.charAt(9));
		}
		finally
		{
			System.out.println("running finnaly block");
		}
		System.out.println("Hii");
		System.out.println("Hello");
	}
}
