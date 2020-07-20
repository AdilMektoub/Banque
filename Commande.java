package Banque;

import java.util.Date;

public class Commande {

	private int id_cmd;
	private Date date; // importer packages util et "pas sql"
	private int quantitéAchetée;
	private float prixTotal;
	Produit produit; 
	Utilisateur utilisateur;
	
	//CONSTRUCTEUR de l'objet COMMANDE
	public Commande(long id_cmd, Date date, int quantitéAchetée, float prixTotal, Produit produit, Utilisateur utilisateur) {
		super();
		this.id_cmd = (int) id_cmd;
		this.date = date;
		this.quantitéAchetée = quantitéAchetée;
		this.prixTotal = prixTotal;
		this.produit = produit;
		this.utilisateur = utilisateur;
	}	
	public Commande() {
		super();
		
		
	}

	//ACESSEUR & MUTATEUR (getteur/setteur)
	public long getId_cmd() {
		return id_cmd;
	}

	public void setId_cmd(long id_cmd) {
		this.id_cmd = (int) id_cmd;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getQuantitéAchetée() {
		return quantitéAchetée;
	}

	public void setQuantitéAchetée(int quantitéAchetée) {
		this.quantitéAchetée = quantitéAchetée;
	}

	public float getPrixTotal() {
		return this.quantitéAchetée * this.produit.getPrix(); // on retourne l'affichage dui prix total en le multipliant la quantité * le prix du produit
	}



	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	//toString
	@Override
	public String toString() {
		return "Commande [id_cmd=" + id_cmd + ", date=" + date + ", quantitéAchetée=" + quantitéAchetée + ", prixTotal="
				+ prixTotal + "]";
	}
	public static Commande passerCMD(int i, Date date2, int j, Utilisateur seb, Produit fossilM) { //création methode CMD
		// TODO Auto-generated method stub
		return null;
	}
	
	//commande ne peut contenir qu'un seul produit
	
	

	
	

	
	
	
	
	
	
	
	
	
}
