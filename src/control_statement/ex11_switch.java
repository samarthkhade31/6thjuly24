package control_statement;

public class ex11_switch
{
	public static void main(String[] args) 
	{
		switch ("CD")
		{
		case "CD" : System.out.println("running CD code");
		break;
		
		case "CW" : System.out.println("running CW code");
		break;
		
		case "MS" : System.out.println("running MS code");
		break;
		
		case "MT" : System.out.println("running MT code");
		break;
		
		case "BI" : System.out.println("running BI code");
		break;
	    
		default : System.out.println("Invalid input");
		}
		
	}

}
