package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ex3_LinkedList 
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.add("salva");
		ll.add(102);
		ll.add(67.52f);
		ll.add('A');
		ll.add(null);
		ll.add(102);
		ll.add(null);
		
		System.out.println(ll.size());					//7
		System.out.println(ll);
		System.out.println(ll.get(0));					//salva
		System.out.println(ll.isEmpty()); 				//false
		System.out.println(ll.contains(102)); 			//true
		
		//update data 
		ll.set(0, "SALVA");
		System.out.println(ll);
		
		//add data in between LinkedList
		ll.add(4,600);
		System.out.println(ll);
		
		//remove data in linked list 
		ll.remove(4);
		System.out.println(ll);
		
		System.out.println("----print data using : for loop----");
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("------print data using : for each loop-----");
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
		
		System.out.println("------print data using : iterator cursor------");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------print data using : ListIterator--------");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		ll.clear();
		System.out.println(ll.size());
		
	}
}
