package control_statement;

public class ex5_else_if 
{
	public static void main(String[] args) 
	{
		int marks = 74;
		
			//74>=80
		if (marks>=80)							//>=80
		{
			System.out.println("distinction");
		}
				//74>=70 & 74<=79
		else if (marks>=70 & marks<=79)				//70 - 79
		{
			System.out.println("1st class");
		}
				//74>=60 & 74<=69
		else if (marks>=60 & marks<=69)				//60 - 69
		{
			System.out.println("2nd class");
		}
				//74>=35 & 74<=59
		else if(marks>=35 & marks<=59)				//35 - 59
		{
			System.out.println("pass");
		}
				//74<=34
		else if (marks<=34)							
		{
			System.out.println("fail");
		}
		
	}

}
