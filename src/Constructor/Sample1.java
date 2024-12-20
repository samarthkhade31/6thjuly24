package Constructor;

public class Sample1
{
	//1:example of default constructor
	
	//default constructor -> provided by compiler
	//use: use to copy/load all the members of class into object

//		Sample1()
//		{
//		
//		}
	
	
	public void m1() 
	{
		System.out.println("running method m1 from same class");
	}
	
	
	public static void main(String[] args) 
	{
		//default constructor call from same class
		Sample1 s1=new Sample1();
		s1.m1();
		
	//1:Sample1 -> className -> as a data type of object
	//2:s1      -> objectName ->to identify object 
	//3:new -> keyword -> use to create empty/blank object
	//4:Sample1 -> className -> constructor call->use to copy all the member of class into object 
	
		
		//default constructor call from diff class
		Sample2 s2=new Sample2();
		s2.m2();
		
	}
}
