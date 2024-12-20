package AccessSpecifier;								

public class Sample1 
{
	//ex1:private specifier
	
	private int num;		//private access specifier 
	
	private Sample1()		//private access specifier 
	{
		num=10;
	}
	
	private void squareofnum() 		//private access specifier
	{
		System.out.println(num*num);
	}
	
	public static void main(String[] args)
	{
		Sample1 s1 = new Sample1();
		s1.squareofnum();
		
		System.out.println(s1.num);
	}
}
