import static org.junit.Assert.*;

import org.junit.Test;

public class DemandeTest {
       
	@Test
	public void declarationDemande() {
		
	}
	@Test
	public void testEtgaeSuivant() throws ExceptionPrenezLesEscaliers, ExceptionVousPouvezPasMonter 
	{
		Demande d1 =new Demande(9,Sens.SENS_MONTER);
		d1.etageSuivant();
		assertSame( 11, d1.getEtage());
	}
	@Test
	public void testChangerDeSens() throws ExceptionVousNePouvezPaschangerdeSens
	{
		Demande d2 =new Demande(9,Sens.SENS_MONTER);
		d2.changeSens(Sens.SENS_DECENTE);
		assertSame( 11, d2.getEtage());
	}

}
