import java.util.Date;

public class Salaries {
	
		private String code;
		private String nom;
		private String prenom;
		private Date dateEmbauche;
		
		
	public Salaries(String code, String nom, String prenom, Date dateEmbauche) {
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateEmbauche = dateEmbauche;
	}
	
	public String getCode() {
		return code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Salaries [code=" + code + ", nom=" + nom + ", prenom=" + prenom + ", dateEmbauche=" + dateEmbauche
				+ "]";
	}

}
