package control_statement;

public class ex1_if 
{
	public static void main(String[] args) 
	{
		
		//    if(condition)   -> true 
		//     {
		//	       if body
		//     }
		
		
		int marks=37;
		
		//  55>=35
		if (marks>=35)
		{
			System.out.println("pass");
		}
		
		//  method calling
		condition();
		
		System.out.println("----------");
		
		ex1_if object1 =new ex1_if();
		object1.c1(101, 85.58f,"sam");
		System.out.println("----------");
		
		ex1_if object4 =new ex1_if();
		object4.c3();
		
		
		
	}      // static regular method 
			public static void condition() 
			{
				int a = 52;
				int b = 25;
				
				if (a>b) 
				{
				System.out.println("a is greater than b");
				}
				else
				{
					System.out.println("a is less than b");
				}
			}
			
			//non static regular method with parameter 
			public void  c1(int sr, float sper, String sn )
			{
				System.out.println(sr+" " + sper+"%"+" " + sn);
			}
			
			//non static regular method without parameter 
			public void c3() 
			{
				int a = 52 ;
				int b = 57 ;
				
				if (a>b)
				{
					System.out.println("a is greater than b");
				}
				else
				{
					System.err.println("a is less than b");
				}
				
			}
				
}

