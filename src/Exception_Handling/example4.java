package Exception_Handling;

public class example4 
{
	public static void main(String[] args)
	{
		int [] ar = {10,20,30,40,50,60};
		
		try
		{
			System.out.println(ar[9]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");  		//failure msg
			System.out.println(ar[0]);    	//alternate code
		}
		
		System.out.println("hiii");
		System.out.println("hlw");
		
	}
}
