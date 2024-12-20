package Constructor;

public class Sample3 
{
	//step1:declaration
	int num1;
	int num2;
	
	//step2:initialization
	//user defined constructor -> provided by user
	//use1:use to initialize global variable
	//use2:to copy all the member of class into object
	
	
	////without parameter
	
	
	Sample3()		//user defined constructor
	{
		num1=10;
		num2=20;
	}
	
	//step3:usage
	public void add() 
	{
		System.out.println(num1+num2);
		
	}
	
	public void sub() 
	{
		System.out.println(num1-num2);
		
	}
	
	public static void main(String[] args)
	{
		//method call from same class
		Sample3 s3 = new Sample3();
		s3.add();
		s3.sub();
		
		System.out.println("-----------");
		
		//method call from diff class
		Sample4 s4 = new Sample4();
		s4.mul();
	}

}
