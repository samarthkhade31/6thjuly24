package Constructor;

public class Sample7 
{

	//ex:4 multiple constructor -> constructor overloading 
	
	int num1;			//100
	int num2;			//2
	String snm; 		//Samarth
	
	
	//1:zero/without parameter constructor 
	Sample7()				//constructor with zero parameter
	{
		num1=10;
		num2=20;
		
	}
	
	
	//2:constructor with parameter
	Sample7(int a, int b)		//2 int parameter constructor
	{
		num1=a;			//100
		num2=b;			//2
		
	}
	
	//3/:String parameter constructor
	Sample7(String s1)
	{
		snm=s1;		//Samarth
	}
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	public void mul()
	{	
		System.out.println(num1*num2);
	}
	
	public void Studentname() 
	{
		System.out.println(snm);
		
	}
	
	public static void main(String[] args) 
	{
		Sample7 s7 = new Sample7();
		s7.add();
		s7.mul();
		
		System.out.println("------------");
		
		Sample7 s8 = new Sample7(100, 2);
		s8.add();
		s8.mul();
		
		System.out.println("----------");
		
		Sample7 s9 = new Sample7("Samarth");
		s9.Studentname();
		
	}
}























