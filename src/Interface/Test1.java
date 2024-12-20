package Interface;
//default method in interface
public interface Test1 
{
	void m1();			//abstract/incomplete method - it is consider as default public and abstract
	
	void m2();			//abstract/incomplete method 
	
	default void m3()		//default method 
	{
		System.out.println("running default method in interface");
	}
	

}
