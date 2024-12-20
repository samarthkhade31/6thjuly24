package StringClass;

import java.util.Arrays;

public class Ex1_ForEachLoop
{
	public static void main(String[] args)
	{
		String [] ar = {"samar", "chetan", "harshal", "prasad", "gaurav"};
		
		
		for(String s1:ar)
		{
			System.out.println(s1);
		}
		
		System.out.println("---------------");
		
		int [] ar1= {10, 30, 40, 20};
		
		Arrays.sort(ar1);
		
		for(int num:ar1)
		{
			System.out.println(num);
		}
	}
}
