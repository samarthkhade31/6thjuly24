package Collection;

import java.util.TreeSet;

public class ex7_generic2 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(102);
		ts.add(101);
		ts.add(104);
		ts.add(103);
		ts.add(105);
		
		System.out.println(ts);
		
		for(Integer s1:ts)
		{
			System.out.println(s1);
		}
		
	}
}
