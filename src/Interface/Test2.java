package Interface;
//default method in interface 
public class Test2 implements Test1
{
	public void m1()
	{
		System.out.println("method m1 completed in implementation class");
	}
	
	public void m2()
	{
		System.out.println("method m2 completed in implementation class");
	}
	
	public static void main(String[] args)			//main method 
	{
		Test2 t2 = new Test2();
		t2.m1();
		t2.m2();
		t2.m3();
	}
}
