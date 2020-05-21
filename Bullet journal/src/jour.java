import java.util.Date;

public class jour 
{
	private Date jour;
	private int humeur;
	private String resume;
	
	public jour()
	{
		this.jour = new Date();
	}
	
	public jour(int hum)
	{
		this.jour = new Date();
		this.humeur = hum;
	}
	
	public jour(int hum, String resu)
	{
		this.jour = new Date();
		this.humeur = hum;
		this.resume = resu;
	}
	
	public Date getJour()
	{
		return jour;
	}
	
	public int getHumeur()
	{
		return humeur;
	}
	
	public String getResume()
	{
		return resume;
	}
	
	public void setJour(Date jour)
	{
		this.jour = jour;
	}
	
	public void setHumeur(int hum)
	{
		this.humeur = hum;
	}
	
	public void setResume(String resu)
	{
		this.resume = resu;
	}	

	
}
