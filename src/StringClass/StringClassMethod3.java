package StringClass;

public class StringClassMethod3 
{
	public static void main(String[] args) 
	{
		String s1="my name is abc";
										  //0    1   2  3	index
		String [] ar =s1.split(" ");      //my name is abc
		
		System.out.println(ar[3]);
		System.out.println(ar[2]);
		System.out.println("size: "+ar.length);
		
		System.out.println("-------------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
}
