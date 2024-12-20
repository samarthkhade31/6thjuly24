package Method;

public class Sample12 
{
	public static void main(String[] args) 
	{
		studentname("Sam");									
		studentname("Samarth");
		
		System.out.println("------------");
		
		studentfullname("abc","pqr","xyz");
		studentfullname("saad","asd","ert");
		
		System.out.println("------------");
		
		studentinfo(1, "sam", 101, 79.25f, 'B');
		System.out.println();											//for spacing
		studentinfo(2, "amar", 102, 65.42f, 'C');
		System.out.println();
		studentinfo(3, "samar", 103, 85.46f, 'A');
	}
	
	//method with String parameter	
	public static void studentname(String name)				//name=""
	{
		System.out.println(name);
	}
	
	//method with 3 String parameter (String, String) 
	public static void studentfullname(String sn, String smn, String sln )				
	{
		System.out.println(sn + " "+ smn + " " + sln);
	}
	
	//method with String, int, float, char parameter
	public static void studentinfo(int srno, String sn, int srollno, float sperc, char sgrade)
	{
		System.out.println("sr no: " + srno);
		System.out.println("student name: " + sn);
		System.out.println("student roll no: " + srollno);
        System.out.println("student perc: " + sperc + "%");
        System.out.println("student grade: " + sgrade);
	}
	

}
