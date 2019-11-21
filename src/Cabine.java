import java.util.ArrayList;

public class Cabine {
    private ArrayList<Demande> dmd;
    public ArrayList<Demande> getDmd() {
		return dmd;
	}
	public Cabine(ArrayList<Demande> dmd, Personne pers) {
		this.dmd = dmd;
		this.pers = pers;
	}
	public void setDmd(ArrayList<Demande> dmd) {
		this.dmd = dmd;
	}
	public Personne getPers() {
		return pers;
	}
	public void setPers(Personne pers) {
		this.pers = pers;
	}
	private Personne pers;
    
}
