package fr.vincefop;

public class Somme {
	
	double n1;
	double n2;
	
	public Somme(){}

	public Somme(double n1, double n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public double sum() {
		return this.n1+this.n2;
	}
	
	
}
