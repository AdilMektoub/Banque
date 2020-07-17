package Banque;

public class Test {

	public static void main(String[] args) {
		
		Utilisateur seb = new Utilisateur("ad", "ad@pop.fr", 30);
		Utilisateur nico = new Utilisateur("es", "es@pop.fr", 26);
		
		Compte s = new Compte(4234, 3000, '€', seb, 200);
		System.out.println(s.toString());
		
		Compte n = new Compte(1641, 4000, '€', nico, 200);
		System.out.println(n.toString());
		
		Compte.transferer(n, s, (float)2000);
		System.out.println("Après transfer !");
		System.out.println(s.toString());
		System.out.println(n.toString());
		
	}

}
