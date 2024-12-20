package TypesofVariable;

public class Sample1 
{
	int num1=10;		//Global Variable
	
	public void m1() 
	{
		int num2=20;    		//local Variable 
		System.out.println(num2);
		System.out.println(num1);
	}
	
	public void m2() 
	{
		int num3 =30;			//Local Variable 
		System.out.println(num3);
		System.out.println(num1);
	}
	
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		s1.m1();
		s1.m2();
		
	}
	
}
