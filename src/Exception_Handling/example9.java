package Exception_Handling;

public class example9 
{
	public static void main(String[] args) 
	{
		int [] ar= {10,20,30,50,60};
		try
		{
			System.out.println(ar[9]);			//risky code 1
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("1st try block- ArrayIndexOutOfBoundsException Handled"); 	//failure msg
		}
		
		
		String s1="velocity";
		try
		{
			System.out.println(s1.charAt(9));		//risky code 2
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("2nd try block- StringIndexOutOfBoundsException Handled");  	//failure msg
		}  
		
		System.out.println("Hiii");
	}
}
