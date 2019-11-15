import java.util.ArrayList;

class AscensseurCol implements Ascensseur {
	ArrayList<Etage> demande;//pour les num etage
	private int etageCourant;
	AscensseurCol nextCabine;
	private int position;
	@Override
	public void demandeEtage(int numEtage)
	{
		
	}
	public void arretProchainNiveau()
	{
		
	}
	@Override
 	public void arreter()
 	{
 		
 	}
	@Override
 	public void descendre()
 	{
		System.out.println("Descendre");
		this.position--;
 	}
	@Override
 	public void monter()
 	{
		System.out.println("Monter");
		this.position++;
 	}
}
