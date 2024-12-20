package Array;

import java.util.Arrays;

public class ex3_ArraySorting1 
{
	public static void main(String[] args) 
	{
		int [] ar=new int [5];
		ar[0]=50;		//10
		ar[1]=40;		//20
		ar[2]=20;		//30		
		ar[3]=30;		//40
		ar[4]=10;		//50
		
		System.out.println("---print original data---");
		for (int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		//Array Sorting 
		Arrays.sort(ar);		//className.methodName();
		
		System.out.println("---print data after sorting(ascending order)---");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----print data in descending order----");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
	}
}
