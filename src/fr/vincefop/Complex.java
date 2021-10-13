package fr.vincefop;

public class Complex {
	int nbreReel;
	int nbreImaginaire;
	
	public Complex() {
		
	}

	public Complex(int nbreReel, int nbreImaginaire) {
		super();
		this.nbreReel = nbreReel;
		this.nbreImaginaire = nbreImaginaire;
	}
	
	public void additionComplexe(Complex x) {
		System.out.println("La somme est : " 
							+ (this.nbreReel+x.nbreReel) 
							+ " + "
							+ (this.nbreImaginaire+x.nbreImaginaire)
							+ "i"
							);
	}
}
