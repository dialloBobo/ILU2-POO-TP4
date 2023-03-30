package produit;
 
public abstract class  Produit {
	
	protected String nom;
	private int unite;

	public Produit(String nom, int unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getNom() {
		return nom;
	}

	public abstract String description();
	
}