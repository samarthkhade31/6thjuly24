package polymorphism;

public class son extends Father			//sub/child class
{
	public void bike()  
	{
		System.out.println("bike : java 42");
	}
	
	
	public void car() 	//method overriding 
	{
		System.out.println("car : Verna");
	}
	
	public void money()			//method overriding 
	{
		System.out.println("money : 1.5 cr");
	}
	
//	public void home() 
//	{
//		System.out.println("home : 2 BHK");
//	}

}	
