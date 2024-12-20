package Casting;

public class TestUpCasting 
{
	public static void main(String[] args)
	{
//		Son s = new Son();
//		s.mobile();
//		s.home();
//		s.money();
//		s.car();
		
		//create object of sub class with reference/dataType of super class
		
		Father f =new Son();
		f.home();
		f.money();
		f.car();
		
	}
}
