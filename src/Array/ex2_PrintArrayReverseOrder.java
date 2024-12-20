package Array;

public class ex2_PrintArrayReverseOrder
{
	public static void main(String[] args)
	{
		int [] ar=new int[5];
		
		ar[0]=10;
		ar[1]=40;
		ar[2]=30;
		ar[3]=20;
		ar[4]=50;
		
		System.out.println(ar[0]);
		
		System.out.println("----print original data----");
		
		for (int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----print array in reverse order----");
			//                 0>=0
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);		//50 20 30 40 10
		}
	}
}
