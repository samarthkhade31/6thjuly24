package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class ex6_Treeset2
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		
		ts.add(107);
		ts.add(105);
		ts.add(104);
		ts.add(106);
		ts.add(102);
		ts.add(103);
		ts.add(101);
		
		System.out.println(ts);
		System.out.println(ts.size());  					//7
		System.out.println(ts.contains(102)); 				//true
		System.out.println(ts.isEmpty()); 					//false
		
		ts.remove(104);
		System.out.println(ts);
		
		System.out.println(ts.first()); 				//get first data 
		System.out.println(ts.last()); 					//get last data 
		
		ts.pollFirst(); 					//delete data from 1st position
		System.out.println(ts);
		
		ts.pollLast(); 						//delete data from last position
		System.out.println(ts);
		
		
		
		System.out.println("-----print data using : for each loop-------");
		for(Object s1:ts)
		{
			System.out.println(s1);
		}
		
		
		System.out.println("----print all data using : iterator cursor-----");
		Iterator itr = ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----print data : using Descending iterator cursor----");
		 Iterator ditr = ts.descendingIterator();
		 while(ditr.hasNext()) 
		 {
			 System.out.println(ditr.next());
		 }
		
	}
}
