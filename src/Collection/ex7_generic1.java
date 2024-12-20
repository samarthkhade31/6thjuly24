package Collection;

import java.util.ArrayList;

public class ex7_generic1
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("salva");
		al.add("mahesh");
		al.add("ramesh");
		al.add("surash");
		al.add("ganesh");
		
		System.out.println(al);
		
		for(String s1:al)
		{
			System.out.println(s1);
		}
	}
}
