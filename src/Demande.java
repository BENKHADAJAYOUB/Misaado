

public class Demande {
    private int etage;
    private String sens;
    
	public int getEtage() {
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	public String getSensDedemande() {
		return sens;
	}
	public void setSensDedemande(String sensDedemande) {
		this.sens = sensDedemande;
	}
	public Demande(int etageDedemande, String sensDedemande) {
		this.etage = etageDedemande;
		this.sens = sensDedemande;
	}
	public void etageSuivant() throws ExceptionPrenezLesEscaliers, ExceptionVousPouvezPasMonter
	//MAX ETAGE  == 16 il faut dire ça 
	{

		if (this.etage == 0 && this.sens == Sens.SENS_MONTER)
			this.etage = this.etage + 9;
		else if (this.etage == 9 && this.sens == Sens.SENS_DECENTE)
			this.etage = this.etage - 9;
		else if (this.etage == 11 && this.sens == Sens.SENS_DECENTE)
			this.etage = this.etage - 2;
		else if (this.etage == 9 && this.sens == Sens.SENS_MONTER)
			this.etage = this.etage + 2;
		else if (this.etage >= 11 && this.etage<16 && this.sens == Sens.SENS_MONTER)
			this.etage = this.etage + 1;
		else if (this.etage >= 11 &&  this.etage<=16 &&this.sens == Sens.SENS_DECENTE)
			this.etage = this.etage - 1;
		else if (this.etage==16 && this.sens==Sens.SENS_MONTER)
			throw new ExceptionVousPouvezPasMonter("Etage MAX==16");
		else
			throw new ExceptionPrenezLesEscaliers("Prenez escalier");
				
		
		      
	}
 	public void changeSens(String s) throws ExceptionVousNePouvezPaschangerdeSens
	{
     if(this.etage==16 && this.sens==Sens.SENS_MONTER)
    	 this.sens = s;
     else if(this.etage==0 && this.sens==Sens.SENS_DECENTE)
         this.sens = s;
     else if(this.sens==Sens.SENS_INDEFINI)
    	 this.sens= s;
     else
    	 throw new ExceptionVousNePouvezPaschangerdeSens("vous ne pouvez pas changer de sens");
	}
    
}
