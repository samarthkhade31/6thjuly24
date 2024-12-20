package Array;

public class ex1_String_Array 
{
	public static void main(String[] args)
	{
		//Array Declaration
		String [] ar = new String[5];		//index -> 0 to 4 which means array index always start with 0
		
		//Array initialization
		ar[0]="Samarth";
		ar[1]="Vaibhav";
		ar[2]="Samar";
		ar[3]="Harshal";
		ar[4]="Prasad";
		
		//Array usage
		System.out.println(ar[0]);
		
		System.out.println(ar.length);			//To find Array size 
		
		
		System.out.println("------print all data from String Array-----");
				//	 5<=4	
		for(int i=0; i<=4; i++)					//by using for loop
		{
			System.out.println(ar[i]);		//Samarth Vaibhav Samar Harshal Prasad
		}
		
		
		//we can use arrayName.length-1 instead of end value, if don't know end value we can use it.
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
