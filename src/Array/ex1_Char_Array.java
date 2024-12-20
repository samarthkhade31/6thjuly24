package Array;

public class ex1_Char_Array
{
	public static void main(String[] args)
	{
		char [] ar=new char[7];				//array declaration 
		
		ar[0]='A';
		ar[1]='B';
		ar[2]='C';							//array initialization
		ar[3]='D';
		ar[4]='E';
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);			//array usage 
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		
		
		System.out.println("size of array is : " + ar.length);			//size of array
		
		System.out.println("------print all data from char array-----");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
