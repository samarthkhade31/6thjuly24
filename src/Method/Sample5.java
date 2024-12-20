package Method;

public class Sample5 
{
	//3: Non Static Method Call From Same Class 
	
	public static void main(String[] args)   							//Main Method Calling
	{
		System.out.println("Hii");
		
		//step 1: Create Object / instance /copy of class
		//step 2: Method call --> objectName.methodName();
			
 
		          // ClassName objectName =new class name();			// object creation 
		
		Sample5 S5=new Sample5();
		
		S5.m1();
		
		//1: Sample5   -> className   -> as a dataType of object 
		//2: S5   -> objectName  -> to refer / identify object 
		//3: new   -> keyword  -> use to create blank/empty object 
		//4: Sample5  -> className () -> constructor -> use to copy / load all the members of class into object 
		System.out.println("Hellow");
		
	}	
	
	//Non static Regular Method 
	
	public void m1() 
	{
        System.out.println("running non-static regular method m1 from same class");		
	}
	 
	//Non-static regular method 
	
	public void m2() 
	{
        System.out.println("running non-static regular method m2 from same class");		
	}
	

}
