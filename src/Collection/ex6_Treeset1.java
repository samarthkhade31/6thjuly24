package Collection;

import java.util.TreeSet;

public class ex6_Treeset1 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add("salva");
		ts.add("mahesh");
		ts.add("ganesh");
		ts.add("ramesh");
		ts.add("suresh");
		ts.add("ramesh");
	//	ts.add(null);  		//nullPointerException
		
		
		System.out.println(ts);
		
	}
}
