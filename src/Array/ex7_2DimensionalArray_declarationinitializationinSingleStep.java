package Array;

public class ex7_2DimensionalArray_declarationinitializationinSingleStep
{
	public static void main(String[] args) 
	{
		//Array Declaration initialization in single Steps
		int [][] ar = {{10, 20, 30},{40, 50, 60}, {70, 80, 90}};
		
		System.out.println(ar[1][2]);
		System.out.println(ar.length);
		
		System.out.println("-----");
		
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
