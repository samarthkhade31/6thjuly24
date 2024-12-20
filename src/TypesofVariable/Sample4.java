package TypesofVariable;

public class Sample4 
{
	//3:non-static global variable call from same class 
	//4:non-static global variable call from diff class
	
	int c=30;			//non-static global variable 
	
	public static void main(String[] args) 
	{
		//3:non-static global variable call from same class
		Sample4 S4=new Sample4();			//create object of same class
		System.out.println(S4.c);			//variableCall -> objName.variableName
	
		
		//4:non-static global variable call from diff class
		Sample5 S5=new Sample5();			//create object of diff class 
		System.out.println(S5.d);			//variableCall-> bojectName.variableName
	}
	
	public static void m3() 
	{
		Sample4 S4=new Sample4();
		System.out.println(S4.c);
	}
	
	public void m4() 
	{ 
		System.out.println(c);
	}

}
