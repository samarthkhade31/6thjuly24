package Array;

public class ex4_DeclarationInitializationInSingleStep2_StringArray 
{
	public static void main(String[] args)
	{			//	index 0				1		2			3		4
		String [] ar = {"Samarth", "Vaibhav", "Suboth", "Prasad", "Harshal"};
		
		System.out.println(ar[2]);
		System.out.println("size: "+ar.length);
		
		System.out.println("print all data: ");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
