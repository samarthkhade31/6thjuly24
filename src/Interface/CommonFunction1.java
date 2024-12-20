package Interface;
//private method in interface
public interface CommonFunction1 
{
	public static void getExcelData()
	{
		getexcelpath();
		System.out.println("code to fetch data from excel sheet");
	}
	
	private static void getexcelpath()
	{
		System.out.println("code to get excel path");
	}
	
	public static void main(String[] args) 
	{
	CommonFunction1.getexcelpath();			//private method calling
	}
}
