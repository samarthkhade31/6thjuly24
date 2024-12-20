package AccessSpecifier;

public class Test2
{
	//calling default specifier from Test1  
	
	public static void main(String[] args) 
	{
		Test1 t1=new Test1();
		t1.squareofnum();
		
		System.out.println(t1.num);
	}
	
}
