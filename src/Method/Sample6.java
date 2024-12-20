package Method;

public class Sample6
{
	//4: Non-static method call from different class 
	
	public static void main(String[] args) 
	{
		//step1. create object of another / diff class
		//step2. method call  -> diffClassObject
		
		
		 //className methodName=new className ();				//Syntax for object
		Sample7 S7=new Sample7 ();
		S7.m7 ();
		
		
	}
	
}
