package fr.vincefop;

public class Vehicule {
	
	public String couleur;
	public String marque;
	public double prix;
	
	public Vehicule() {
		System.out.println("Passage par le constructeur");
		System.out.println(this);
		this.marque = "Tesla";
		this.couleur = "rouge";
		this.prix = 10.99;
	}
	
	public Vehicule(String marque, double prix) {
		this.marque	= marque;
		this.prix = prix;
	}
	
//	INTERDIT
//	public Vehicule(String couleur, double prix) {
//		this.couleur = couleur;
//		this.prix = prix;
//	}
	
	public Vehicule(String couleur, String marque, double prix) {
		this(marque, prix);
		this.couleur = couleur;
	}


	@Override
	public String toString() {
		return "Vehicule [couleur=" + couleur + ", marque=" + marque + ", prix=" + prix + "]";
	}
	
	public void repeindre (String couleur) {
		this.couleur = couleur;
	}
	
	
}
