package Array;

import java.util.Arrays;

public class ex3_ArraySorting2 
{
	public static void main(String[] args) 
	{
		String [] ar=new String [5];
		
		ar[0]="Samarth";
		ar[1]="Vaibhav";
		ar[2]="Prasad";
		ar[3]="Harshal";
		ar[4]="Samar";
		
		System.out.println("----before sorting----");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		//Array Sorting
		Arrays.sort(ar);
		
		System.out.println("----after sorting----");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
	}
	
}
