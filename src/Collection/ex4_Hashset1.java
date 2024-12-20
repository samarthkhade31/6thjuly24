package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class ex4_Hashset1
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add("salva");
		hs.add(101);
		hs.add('A');
		hs.add(75.58f);
		hs.add(null);
		hs.add(101);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty()); 			//false
		System.out.println(hs.contains("salva"));	//true
		
		//remove data
		hs.remove('A');
		System.out.println(hs);
	//	hs.removeAll(hs);
	//	System.out.println(hs);
		
		System.out.println("-----print data using : for each loop-----");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
		System.out.println("-----print data using : iterator----");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
				
		System.out.println("-------");
		hs.clear();
		System.out.println(hs.size());
		
	}
	
}
