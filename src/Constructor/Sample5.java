package Constructor;

public class Sample5
{
	int num1;		//20
	int num2;		//10
	
	
	//user defined constructor with parameter 
	//2 int parameter constructor
	
	Sample5(int a, int b)								//declaration
	{
		num1=a;			//20				//assign local variable into global
		num2=b;			//10
	}
	
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
			Sample5 s5= new Sample5(20, 10);
			s5.add();
			s5.sub();
			
			System.out.println("----------");
			
			Sample5 s6 = new Sample5(200,100);
			s6.add();
			s6.sub();
			
			System.out.println("-----------------");
			
			Sample6 s7 = new Sample6(3,5);
			s7.mul();
			
			Sample6 s8 = new Sample6(40,20);
			s8.mul();
			
	}
}
