package Banque;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		Utilisateur seb = new Utilisateur("Sébastien", "seb@pop.fr", 30);
		Utilisateur nico = new Utilisateur("Nicolas", "nico@pop.fr", 26);
		
		Compte s = new Compte(666, 333370, '$', seb, 200);
		System.out.println(s.toString());
		
		Compte n = new Compte(777, 3000, '$', nico, 50);
		System.out.println(n.toString());
			
		Produit fossilM = new Produit(1, "montre fossil", 100, 120);
		
		Commande comS = Commande.passerCMD(1, new Date(), 300, seb, fossilM);
		System.out.println(s.getSolde());
		System.out.println(fossilM.getQuantité());
		
	}
}

























//Compte.transferer(s, n, (float)1000);
//Compte.transferer(s, n, (float)1900, '€');
//System.out.println("Après transfer !");
//System.out.println(s.toString());
//System.out.println(n.toString());
