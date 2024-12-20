package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ex4_Hashset2
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		
		al.add("salva");
		al.add(101);
		al.add('A');
		al.add(85.25f);
		al.add(null);
		al.add(101);
		al.add(null);
		al.add('A');
		
		System.out.println(al);			//[salva, 101, A, 85.25, null, 101, null, A]
		
		HashSet hs = new HashSet(al);
		System.out.println(hs); 			//salva, 101, A, 85.25, null
		
	}
}
