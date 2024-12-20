package AccessSpecifier;

public class Test11 
{
	//ex4:public specifier
	public int a;					//public specifier
	
	public Test11()					//public specifier
	{
		a=10;
	}
	
	public void squareofnum() 		//public specifier
	{
		System.out.println(a*a);
	}
	
	public static void main(String[] args) 
	{
		Test11 t11 = new Test11();
		t11.squareofnum();
		
		System.out.println(t11.a);
	}
}
