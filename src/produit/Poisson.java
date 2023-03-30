package produit;

public class Poisson extends Produit{
	private String date;


	public Poisson(String nom, int unite, String date) {
		super(nom, unite);
		this.date = date;
	}


	@Override
	public String description() {
		return ( nom + "pechés mardi");
		
	}

}