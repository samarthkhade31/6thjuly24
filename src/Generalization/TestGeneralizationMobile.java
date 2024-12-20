package Generalization;

public class TestGeneralizationMobile 
{
	public static void main(String[] args) 
	{	
		System.out.println("features of Jio: ");
		JioSim jio = new JioSim();
		jio.calltime();
		jio.msgtime();
		jio.videocalltime();
		jio.rechargepayment();
		
		System.out.println("");
		
		System.out.println("features of Bsnl: ");
		BsnlSim bsnl = new BsnlSim();
		bsnl.calltime();
		bsnl.msgtime();
		bsnl.videocalltime();
		bsnl.rechargepayment();
		
		System.out.println("");
		
		System.out.println("features of Airtail: ");
		AirtailSim airtail = new AirtailSim();
		airtail.calltime();
		airtail.msgtime();
		airtail.videocalltime();
		
		System.out.println("");
		
		System.out.println("features of Vi: ");
		ViSim vi = new ViSim();
		vi.calltime();
		vi.msgtime();
		vi.videocalltime();
		vi.payment();
		
	}
}
