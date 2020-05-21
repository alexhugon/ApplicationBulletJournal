import java.util.Date;
import java.util.Scanner;

public class utilisateur 
{
	private String nom;
	private String prenom;
	private Date naissance;
	private String password;
	
	public utilisateur()
	{
		
	}
	public utilisateur(String n, String pn, Date nais, String pwd)
	{
		this.nom = n;
		this.prenom = pn;
		this.naissance = nais;
		this.password = pwd;
	}
	public String getNom()
	{
		return this.nom;
	}
	public void setNom(String n)
	{
		this.nom = n;
	}
	public String getPrenom()
	{
		return this.prenom;
	}
	public void setPrenom(String pn)
	{
		this.prenom = pn;
	}
	public Date getNaissance()
	{
		return this.naissance;
	}
	public void setNaissance(Date naiss)
	{
		this.naissance = naiss;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setPassword(String pwd)
	{
		this.password = pwd;
	}
	
	public void Resetpassword()
	{
		System.out.println("Entrez le nouveau mot de passe");
		Scanner pwd = new Scanner(System.in);
		String newpwd = pwd.nextLine();
		setPassword(newpwd);
		System.out.println("votre nouveau mot de passe est " + getPassword());
		pwd.close();
	}
}
