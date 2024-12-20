package Method;

public class Sample2 
{
	public static void main(String [] args)
   {
	System.out.println("Hellow , These is Samarth ");	
	m1();
	msg2();
	m3();
	samarthkhade();
   }	
	
	public static void m1()
	{
		int a;
		int b;
		a=40;
		b=10;
		System.out.println(a+b);
		System.out.println("Hii");
	}
	public static void msg2()
	{
		System.out.println("Vaibhav");
	}
	public static void m3()
	{
		String Studentname;
		Studentname=("Samarth, Vaibhav, Sam, Karan ");
		System.out.println(Studentname);
	}
	public static void samarthkhade()
	{
		String Sname;
		int Sroll;
		float Sperc;
		char Sg;
		
		Sname="Samarth, Vaibhav ";
		Sroll= 20249;
		Sperc= 82.21F;
		Sg= 'A';
		
		System.out.println("Student Name: " + Sname);
		System.out.println("Student Roll Number: "+ Sroll);
		System.out.println("Student Percentage: "+ Sperc);
		System.out.println("Student Grade: "+ Sg);
		
				
	}
}
