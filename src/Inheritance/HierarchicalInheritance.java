package Inheritance;

public class HierarchicalInheritance
{
	public static void main(String[] args) 
	{
		
		System.out.println("----features of son1-----");
		son1 s1 = new son1();
		s1.bike();
		s1.car();
		s1.home();
		s1.money();
		
		System.out.println(" ");
		System.out.println("----features of son2-----");
		son2 s2 = new son2();
		s2.mobile();
		s2.home();
		s2.money();
		s2.car();
		
		System.out.println(" ");
		System.out.println("----features of son3-----");
		son3 s3 = new son3();
		s3.laptop();
		s3.car();
		s3.home();
		s3.money();
		
	}
}
