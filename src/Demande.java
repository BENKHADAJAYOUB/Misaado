import outils.Sens;

public class Demande {
    private int etage;
    private String sensDedemande;
	public Demande(int etageDedemande, String sensDedemande) {
		this.etage = etageDedemande;
		this.sensDedemande = sensDedemande;
	}
	public int etageSuivant()
	//MAX ETAGE  == 16 il faut dire ça 
	{
		if (this.etage == 0 && this.sensDedemande == Sens.SENS_MONTER)
			return this.etage = etage + 9;
		else if (this.etage == 9 && this.sensDedemande ==Sens.SENS_DECENTE )
			return this.etage = etage -9;
		else if(this.etage == 11 && this.sensDedemande == Sens.SENS_DECENTE)
			return this.etage = etage-2;
		else if(this.etage == 9 && this.sensDedemande == Sens.SENS_DECENTE)
			return this.etage = etage+2;
		else if(this.etage>=11 && this.sensDedemande ==Sens.SENS_MONTER)
			return this.etage = etage +1;
		else if(this.etage>=11 && this.sensDedemande ==Sens.SENS_DECENTE)
			return this.etage = etage -11;
		else
			
	return etage;
	}
	public void changeSens(Sens s)
	{
		
	}
    
}
