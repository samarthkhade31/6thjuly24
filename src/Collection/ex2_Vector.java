package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ex2_Vector
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();		//initial capacity = 10
		v.add("Salva");
		v.add(101);
		v.add(68.52f);
		v.add('A');
		v.add(null);
		v.add(101);
		v.add(null);
		
		System.out.println(v.capacity());					//10
		System.out.println(v);
		System.out.println(v.size()); 						//7
		System.out.println(v.get(0));						//salva
		System.out.println(v.contains(101));				//true
		System.out.println(v.isEmpty()); 					//false
		
		//updata data 
		v.set(0, "SALVA");
		System.out.println(v);
		
		//add data in between vector -> right shift operation 
		v.add(4,500);
		System.out.println(v);
		
		//remove data in between vector -> left shift operation
		v.remove(4);
		System.out.println(v);
		
		System.out.println("----------print data using : for loop ----------");
		for(int i=0; i<=v.size()-1; i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("------print data using : for each loop------");
		for(Object s1:v)
		{
			System.out.println(s1);
		}
		
		System.out.println("------print data using : iterator cursor------");
		Iterator itr = v.iterator();	//copy all data from vector to iterator object
										//[SALVA, 101, 68.52, A, null, 101, null]
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------print data using : ListIterator cursor------");
		ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("-----print data using : Enumeration cursor-----");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		System.out.println("------");
		v.clear();
		System.out.println(v.size());
		
	}
}
