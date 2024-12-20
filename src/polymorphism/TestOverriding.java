package polymorphism;

public class TestOverriding 
{
	public static void main(String[] args)
	{
	//	Father f=new Father();
	//	f.home();
	//	f.car();
	//	f.money();
		
		System.out.println("");
		
		son s =new son();
		s.bike();
		s.home();
		s.car();
		s.money();
	}
}
