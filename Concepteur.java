import java.util.ArrayList;
import java.util.Date;

public class Concepteur extends Salaries {
	
	private Integer anneeDev;
	
	public Concepteur(String code, String nom, String prenom, Date dateEmbauche, Integer anneeDev ) {
		super(code, nom, prenom, dateEmbauche);
		ArrayList<Concepteur> listConcepteur = new ArrayList<Concepteur>();
		this.anneeDev = anneeDev;
	}
	
	@Override 
    public String toString()
    {
        return super.toString() + " | Année de déveleoppement: " + Integer.toString(anneeDev);
    }

	
	public Integer getAnneeDev() {
		return anneeDev;
	}
	
	public void setNbDeplacementClient(Integer anneeDev) {
		this.anneeDev = anneeDev;
	}
	
}
