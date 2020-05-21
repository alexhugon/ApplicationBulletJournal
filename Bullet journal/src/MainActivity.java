import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean fuse = true;
		//recup l'utilisateur en BDD si pas d'utilisateur en crer un nouveau
		Date datalex = new Date();
		utilisateur user = new utilisateur("Hugon", "Alexandre", datalex, "handball98");
		/*fuse = false;*/
		
		//ouvre la fenetre de connexion
		//FenetreStart fen = new FenetreStart(user);
		if(fuse)
		{
			System.out.println("Nom");
			String nom = sc.nextLine();
			System.out.println("Prenom");
			String prenom = sc.nextLine();		
			System.out.println("Date de naissance");
			String datenaiss = sc.nextLine();
			System.out.println("Mot de Passe");
			String motpasse = sc.nextLine();
			DateFormat format = new SimpleDateFormat("dd mm yyyy");
	    	Date date = null;
			try {
				date = format.parse(datenaiss);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			utilisateur newuser = new utilisateur(nom, prenom, date, motpasse);
		}
		else
		{
			String tentative = null;
			String mdp = user.getPassword();
			while(tentative != mdp)
			{
				System.out.println("entrez mot de passe");
				tentative = sc.nextLine();
			}
		}
		
			//ouvre la fenetre de l'appli
		int appli = 1;
		while(appli == 1)
		{
			System.out.println("1 - ajouter un jour au bullet jounal");
			System.out.println("2 - voir les statistiques");
			int choix = sc.nextInt();
			if(choix == 1)
			{
				System.out.println("Ajout d'une nouvelle journée");
				System.out.println("entré votre humeur");
				int humeur = sc.nextInt();
				System.out.println("Faite un résumé de votre journée");
				String resume = sc.nextLine();
				jour ajd = new jour(humeur, resume);
				System.out.println("1 - rester");
				System.out.println("2 - sortir");
				appli = sc.nextInt();
			}
			if(choix == 2)
			{
				//récuperation de tout les objet jour et affichage de l'humeur
			}
		}

	}

}
