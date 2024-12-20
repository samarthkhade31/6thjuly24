package Method;

public class Sample1 
{     //1: Static regular method call from same class 
	
	// Main Method                  (main -> method name)
	
	public static void main(String[] args)       //pre-defined method
	{
		System.out.println("Hellow");
		System.out.println("Hii");
		m1();                          //methodname();    method calling
	    m2();
	    m2();
	    m1();
	 }
	  
	
	//Static regular method
	
	public static void m1()   // User Defined  // Regular method declaration
	{
		System.out.println("Am Samarth");
	}
	
	// Static Regular method 
	
	public static void m2()        //User Defined     // Regular method declaration 
	{
		System.out.println("Running m2");
	}
}
