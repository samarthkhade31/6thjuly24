package Array;

public class ex1_int_Array 
{
	public static void main(String[] args)
	{
		//Array Declaration
		int ar[] = new int[5];
		
		//Array initialization
		ar[0]=101;
		ar[1]=102;
		ar[2]=103;
		ar[3]=104;
		ar[4]=105;
	
		//Array usage
		System.out.println(ar[1]);
				
		//to find size/length of an Array
		System.out.println(ar.length);			//arrayName.length
		
		
		System.out.println("------print all data from int Array-------");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
	}
}
