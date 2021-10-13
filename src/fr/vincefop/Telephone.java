package fr.vincefop;

public class Telephone {
	
	public String marque;
	public String modele;
	public String couleur;
	public double prix;
	
	public Telephone() {
		
	}
	
	public Telephone(String marque, String modele, String couleur, double prix) {
		this.couleur = couleur;
		this.marque = marque;
		this.prix = prix;
		this.modele = modele;
	}
	
	public void envoyerMessage(String message) {
		System.out.println(message);
	}
	
	public void appeler(String destinataire) {
		System.out.println("Je suis en train d'appeler " + destinataire);
	}

	@Override
	public String toString() {
		return "Telephone [marque=" + marque + ", modele=" + modele + ", couleur=" + couleur + ", prix=" + prix + "]";
	}

	
}
