package MethodWithReturnType;

public class Sample4 
{
	public static void main(String[] args)
	{
		String s2 = convertNameToUpperCase("abc");
		System.out.println(s2);
		
		System.out.println(convertNameToUpperCase("xyz"));
		
		System.out.println("--------");
		
		int I1 = getLengthOfName("Samarth");
		System.out.println(I1);
		
		System.out.println(getLengthOfName("Samar"));
	}
	
	public static String convertNameToUpperCase(String name) 
	{
		String s1 = name.toUpperCase();
		return s1;
	}
	
	public static int getLengthOfName(String name) 
	{
		int length = name.length();
		return length;
	}
}
