package StringClass;

public class StringClassMethod1 
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="ABCD";
		String s3="abcd";
		
//		System.out.println(s1);
		
		System.out.println(s1.length());		//8
		System.out.println(s1.toUpperCase());		//VELOCITY
		
//		s1=s1.toUpperCase();
//		System.out.println(s1);
		
		System.out.println(s2.toLowerCase());		//abcd
//		s2=s2.toLowerCase();
//		System.out.println(s2);
		
		System.out.println(s2.equals(s3)); 			//False compare both data & case
		System.out.println(s2.equalsIgnoreCase(s3)); 		//true compare only data 
 		
		System.out.println("-----------------------");
		
		String s4="my name is samar";
		String s5="";
		String s6="abcaba";
				
		System.out.println(s4.contains("name"));		//true		//contains method
		System.out.println(s4.startsWith("my"));		//true		//startsWith method
		System.out.println(s4.endsWith("samar"));		//true		//endsWith method
		
		System.out.println("----------");
		System.out.println(s5.isEmpty());			//true 			//isEmpty method
		System.out.println(s1.isEmpty()); 			//false 		//isEmpty method
		System.out.println(s4.charAt(5));     //m					//charAt method
		System.out.println(s6.indexOf('c')); 		//2		//find index of 1st occurrence of char 
		System.out.println(s6.lastIndexOf('b'));	//4 	//find index of last occurrence of char
	
	}
}
