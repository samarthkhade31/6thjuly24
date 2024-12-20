package AccessSpecifier;

public class Test5
{
	//ex3:protected specifier 
	protected int a;				//protected specifier
	
	protected Test5()				//protected specifier
	{
		a=10;
	}
	
	protected void squareofnum() 			//protected specifier
	{
		System.out.println(a*a);
	}

	public static void main(String[] args) 
	{
		Test5 t5=new Test5();
		t5.squareofnum();
		
		System.out.println(t5.a);
	}
}
