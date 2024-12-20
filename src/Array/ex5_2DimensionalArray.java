package Array;

public class ex5_2DimensionalArray 
{
	public static void main(String[] args)
	{

		//   0  1  2 
		// 0 10 20 30				//2*3
		// 1 40 50 60 
	
		//Array declaration
		int [][] ar =new int[2][3];
	
		//Array initialization
		ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=30;
		ar[1][0]=40;
		ar[1][1]=50;
		ar[1][2]=60;
		
		System.out.println(ar[1][1]);
		System.out.println("Array size: "+ar.length);
		
		System.out.println("------");
		
		//           2<=1
		for(int i=0; i<=1; i++)						//1: outer for loop -> rows
		{
			//           3<=2
			for(int j=0; j<=2; j++)  					//2: inner for loop -> coln
			{
				System.out.print(ar[i][j]+" ");		//3: print info using print statement
			}
			System.out.println();				//4: empty println statement
		}
												// 10 20 30
	}											// 40 50 60
	
}
