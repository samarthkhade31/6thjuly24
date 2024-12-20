package control_statement;

public class ex6_else_if 
{
	public static void main(String[] args) 
	{
		int marks = 34;
			// 34>=80
		if (marks>=80)
		{
			System.out.println("distinction");
		}
				  //34>=70 & 34<=79
		else if (marks>=70 & marks<=79)
		{
			System.out.println("1st class");
		}
				  //34>=60 & 34<=69
		else if (marks>=60 & marks<=69)
		{
			System.out.println("2nd class");
		}
				  //34>=35 & 34<=59
		else if (marks>=35 & marks<=59)
		{
			System.out.println("pass");
		}
		else    //<35 or <=34
		{
			System.out.println("fail");
		}
		
	}

}
