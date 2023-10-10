import java.util.ArrayList;
import java.util.Date;

public class Analyste extends Salaries {
	
	private Integer nbDeplacementClient;

	public Analyste(String code, String nom, String prenom, Date dateEmbauche, Integer nbDeplacementClient) {
		super(code, nom, prenom, dateEmbauche);
		ArrayList<Analyste> listAnalyste = new ArrayList<Analyste>();
		this.nbDeplacementClient = nbDeplacementClient;
	}
	
	@Override 
    public String toString()
    {
        return super.toString() + " | Nombre de déplacement : " + Integer.toString(nbDeplacementClient);
    }
	
	public Integer getNbDeplacementClient() {
		return nbDeplacementClient;
	}
	
	public void setNbDeplacementClient(Integer nbDeplacementClient) {
		this.nbDeplacementClient = nbDeplacementClient;
	}
}
