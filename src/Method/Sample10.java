package Method;

public class Sample10 
{
	//6: method with parameter 
	
	public static void main(String[] args)
	{
		add(10,40);											//method call -> variable initialization
		add(50,40);
		
		System.out.println("...................");
		
		Sample10 S1=new Sample10();
		S1.sub(10, 20);
		S1.sub(200, 100);
		
		System.out.println("..................");
		
		Sample11.mul(10,20);
		Sample11.mul(12,4);
		
		
		System.out.println("..................");
		
		Sample11 S2 = new Sample11();
		S2.square(20);
		S2.square(5);
		S2.square(6);
	}
	
	//method with 2 int (int, int) parameter 
	
	public static void add(int num1,int num2) 		//num1=0, num2=0				//variable declaration
	{												
		System.out.println(num1+num2);				//50
	}
	
	public void sub(int num1, int num2) 			//num1=10, num2=20
	{
		System.out.println(num1-num2);				//-10
	}

}
