package Banque;

public class Utilisateur {
	
	private String nom;
	private String email;
	private int age;
		
	public Utilisateur(String nom, String email, int age) {
		this.nom = nom;
		this.email = email;
		this.age = age;
	}
		
	
	public String getNom() {
		return nom;
	}
	public String getEmail() {
		return email;
	}
	public int getAge() {
		return age;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", email=" + email + ", age=" + age + "]";
	}

	

}
