package Constructor;

public class Sample4
{
	//step1: declaration
	int num3;
	int num4;
	
	//initialization
	//user defined constructor -> provided by user 
	//use1: use to initialize global variable
	//use2: use to copy/load all the member of class into object 
	
	Sample4()				//user defined constructor 
	{
		num3=30;
		num4=40;
	}
	
	public void mul() 
	{
		System.out.println(num3*num4);
	}

}
