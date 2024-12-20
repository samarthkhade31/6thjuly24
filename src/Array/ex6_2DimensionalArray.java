package Array;

public class ex6_2DimensionalArray
{
	public static void main(String[] args)
	{
		
		//   0   1   2   
		//0  10  20  30 		//3*3 matrix
		//1  40  50  60
		//2  70  80  90
		
		//Array declaration 
		int [][] ar = new int[3][3];
		
		//Array initialization 
		ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=30;
		ar[1][0]=40;
		ar[1][1]=50;
		ar[1][2]=60;
		ar[2][0]=70;
		ar[2][1]=80;
		ar[2][2]=90;
		
		System.out.println(ar[1][1]);
		System.out.println("size of Array : "+ar.length);
		
		System.out.println("----3*3----");
		
		//           3<=2
		for(int i=0; i<=ar.length-1; i++)							//outer for loop -> rows 
		{		//       3<=2
			for(int j=0; j<=ar.length-1; j++)						//inner for loop -> coln
			{
				System.out.print(ar[i][j]+" ");						//print info using print statements
			}
			System.out.println();
		}											//  10 20 30 
	}												//  40 50 60 
													//  70 80 90 		
}															
