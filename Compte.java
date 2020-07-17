package Banque;

public class Compte {

	int numero;
	float solde;
	char devise;
	Utilisateur user;
	float decouvert;

	public Compte(int numero, float solde, char devise, Utilisateur user, float decouvert) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.devise = devise;
		this.user = user;
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + ", devise=" + devise + ", user=" + user
				+ ", decouvert=" + decouvert + "]";
	}

	public int getNumero() {
		return numero;
	}

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	public float getSolde() {
		return solde;
	}

	public char getDevise() {
		return devise;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public void setDevise(char devise) {
		this.devise = devise;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	static void transferer(Compte emmetteur, Compte destinataire, float montant) {
		boolean possible = false;
		if ((emmetteur.getDevise() != '€' && emmetteur.getDevise() != '$') ||
				(destinataire.getDevise() != '€' && destinataire.getDevise() != '$')	) {
			System.out.println("une ou les 2 devises ne sont pas pris en compte !");
		}
		else {			
			if (emmetteur.getSolde() + emmetteur.getDecouvert() > montant)
				possible = true;
			else 	System.out.println("Le solde de " + emmetteur.getUser().getNom() + " est insuffisant");
			
			if (possible) {
				if (emmetteur.getDevise() == '€' && destinataire.getDevise()=='$') {
					emmetteur.retirer(montant);
					montant = (float) (montant * 1.14);
					destinataire.alimenter(montant);
				}
				else if (emmetteur.getDevise() == '$' && destinataire.getDevise()=='€') {
					emmetteur.retirer(montant);
					montant = (float) (montant * 0.88);
					destinataire.alimenter(montant);
				}		
				else if (emmetteur.getDevise() == destinataire.getDevise()) {
					emmetteur.retirer(montant);
					destinataire.alimenter(montant);
				}
			}
		}
	}

	public void alimenter(float montant) {
		this.setSolde(montant + this.getSolde());
	}

	public void retirer(float montant) {
		this.setSolde(this.getSolde() - montant);
	}
	


}
