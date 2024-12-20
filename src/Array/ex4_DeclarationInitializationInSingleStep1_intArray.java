package Array;

import java.util.Arrays;

public class ex4_DeclarationInitializationInSingleStep1_intArray 
{
	public static void main(String[] args) 
	{
		int [] ar = {30, 20, 40, 10};		//length=4  si=0, ei=3
		
		System.out.println(ar[2]);
		System.out.println("size: "+ar.length);
		
		System.out.println("print original data: ");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);
		
		System.out.println("print sorted data: ");
		for(int i=0; i<=3; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("print data in descending order: ");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
	}
}
