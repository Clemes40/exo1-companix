import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main  {

	public static void main(String[] args) throws IOException {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		   ArrayList<Concepteur> listConcepteur = new ArrayList<Concepteur>();
		   ArrayList<Analyste> listAnalyste = new ArrayList<Analyste>();
		   Date dateEmbauche1 = null;
		   Date dateEmbauche = null;
		   Boolean boucle = true;
		   Boolean trouve = false;
	       DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
	       while (boucle == true) {
			   String menu = "Veuillez choisir un numéro :\n" +
			           "1- Ajouter un concepteur\n" +
			           "2- Supprimer un concepteur\n" +
			           "3- Lister les concepteurs existants\n" +
			           "4- Ajouter un analyste\n" +
			           "5- Supprimer un analyste\n" +
			           "6- Lister les salariés existants en mettant en évidence la fonction (Concepteur ou Analyste)";
			   System.out.println(menu);
			   int choix = Integer.parseInt(in.readLine());
			   switch(choix) {
				   case 1 :
				       System.out.println("Saisir le code concepteur :");
				       String code = in.readLine();
				       boolean codeExists = false;
				       for (Concepteur c : listConcepteur) {
				           if (c.getCode().equals(code)) {
				               codeExists = true;
				               break;
				           }
				       }
				       if (codeExists) {
				           System.out.println("Ce code est déjà utilisé pour un autre Concepteur");
				           continue;
				       }
				       System.out.println("Saisir le nom du concepteur :");
				       String nom = in.readLine();
				       System.out.println("Saisir le prénom du concepteur :");
				       String prenom = in.readLine();
				       System.out.println("Saisir la date d'embauche du concepteur (YYYY-MM-DD)");
				       String stringDate = in.readLine();
					   try {
							dateEmbauche = format.parse(stringDate);
					   } catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
					   }
				       System.out.println("Combien d'année de déveleppement à le concepteur :");
				       Integer anneeDev = Integer.parseInt(in.readLine());
				       Concepteur concepteur = new Concepteur(code, nom, prenom, dateEmbauche, anneeDev);
				       listConcepteur.add(concepteur);
				       System.out.println("Le concepteur " + nom + " " + prenom + " a bien été ajouté");
				       break;
				       
				   case 4 :
					   System.out.println("Saisir le code analyste :");
					   String code1 = in.readLine();
				       boolean codeExists1 = false;
				       for (Concepteur c : listConcepteur) {
				           if (c.getCode().equals(code1)) {
				               codeExists1 = true;
				               break;
				           }
				       }
				       if (codeExists1) {
				           System.out.println("Ce code est déjà utilisé pour un autre Analyste");
				           continue;
				       }
					   System.out.println("Saisir le nom du analyse :");
					   String nom1 = in.readLine();
					   System.out.println("Saisir le prénom du analyste :");
					   String prenom1 = in.readLine();
					   System.out.println("Saisir la date d'embauche de analyste (YYYY-MM-DD)");
					   String stringDate1 = in.readLine();
					   try {
							dateEmbauche1 = format.parse(stringDate1);
					   } catch (ParseException e) {
							e.printStackTrace();
					   }
					   System.out.println("Combien de deplacement Client pour l'analyste : ");
					   Integer nbDeplacementClient = Integer.parseInt(in.readLine());
					   Analyste analyste = new Analyste(code1, nom1, prenom1, dateEmbauche1, nbDeplacementClient);
					   listAnalyste.add(analyste);
					   System.out.println("L'analyste " + nom1 + " " + prenom1 + " a bien été ajouté");
				       System.out.println("la liste:"+listAnalyste);
					   break;
					   
				   case 2:
					    System.out.println("Saisir le code du concepteur à supprimer:");
					    String codeDelete = in.readLine();
					    trouve = false;
					    for (Concepteur c : listConcepteur) {
					        if (c.getCode().equals(codeDelete)) {
					            listConcepteur.remove(c);
					            System.out.println("Concepteur supprimé.");
					            trouve = true;
					            break;
					        }
					    }
					    if (!trouve) {
					        System.out.println("Aucun concepteur trouvé avec le code donné.");
					    }
					    break;
					    
				   case 3:
					    System.out.println("Liste des concepteurs:");
					    for (Concepteur c : listConcepteur) {
					        System.out.println(c);
					    }
					    break;

					    
				   case 5:
					    System.out.println("Saisir le code de l'analyste à supprimer:");
					    String codeDeleteAnalyste = in.readLine();
					    trouve = false;
					    for (Analyste a : listAnalyste) {
					        if (a.getCode().equals(codeDeleteAnalyste)) {
					            listAnalyste.remove(a);
					            System.out.println("Analyste supprimé.");
					            trouve = true;
					            break;
					        }
					    }
					    if (!trouve) {
					        System.out.println("Aucun analyste trouvé avec le code donné.");
					    }
					    break;

					    
				   case 6:
					    System.out.println("Liste des salariés:");

					    System.out.println("Concepteurs:");
					    listConcepteur.stream()
					        .sorted(Comparator.comparing(Concepteur::getCode))
					        .forEach(c -> System.out.println("Concepteur: " + c));

					    System.out.println("Analystes:");
					    listAnalyste.stream()
					        .sorted(Comparator.comparing(Analyste::getCode)) 
					        .forEach(a -> System.out.println("Analyste: " + a));
					    break;


			   }
		  } 
	   }
}
