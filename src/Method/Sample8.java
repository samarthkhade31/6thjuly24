package Method;

public class Sample8 
{
	//5: method without parameter 
	
	public static void main(String[] args) 
	{
		System.out.println("Hellow");
		
	// static regular method call from same class
		m1();
		
	//static regular method call from diff class
		Sample9.m2();
		
	//non static method call from same class
		Sample8 S8=new Sample8();
		S8.m3();
	
	//non static method call from diff class 
		Sample9 S9=new Sample9();
		S9.m4();
		
	}
	
	public static void m1()       			// method without/zero parameter 
	{
		System.out.println("running static method m1 from same class");
		
	}
	public void m3() 						// method without/zero parameter 
	{
		System.out.println("running non static method m3 from diff class");
	}

}
