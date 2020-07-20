package Banque;

public class Produit {

	private long id_produit;
	private String nom;
	private int quantité;
	private float prix;
	Commande commande;
	
	// CONSTRUCTEUR de l'objet PRODUIT
	public Produit(long id_produit, String nom, int quantité, float prix) {
		super();
		this.id_produit = id_produit;
		this.nom = nom;
		this.quantité = quantité;
		this.prix = prix;
	}

	//	ACCESSEUR & MUTATEUR (getteur et setteur)
	public long getId_produit() {
		return id_produit;
	}

	public void setId_produit(long id_produit) {
		this.id_produit = id_produit;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantité() {
		return quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	// TO STRING 
	@Override
	public String toString() {
		return "Produit [id_produit=" + id_produit + ", nom=" + nom + ", quantité=" + quantité + ", prix=" + prix + "]";
	}
	
}
