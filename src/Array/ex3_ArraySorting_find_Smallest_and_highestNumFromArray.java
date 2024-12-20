package Array;

import java.util.Arrays;

public class ex3_ArraySorting_find_Smallest_and_highestNumFromArray
{
	public static void main(String[] args)
	{
		int [] ar=new int[5];
		ar[0]=50;				//after sorting //10
		ar[1]=30;								//20
		ar[2]=20;								//30
		ar[3]=10;								//40
		ar[4]=40;								//50
		
		Arrays.sort(ar);
		
//		System.out.println("array after sorting------");
//		for(int i=0; i<=ar.length-1; i++)
//		{
//			System.out.println(ar[i]);
//		}
		
		System.out.println("smallest num : "+ar[0]);			//smallest num
		System.out.println("largest num : "+ar[ar.length-1]);	//highest num
		
	}
}
