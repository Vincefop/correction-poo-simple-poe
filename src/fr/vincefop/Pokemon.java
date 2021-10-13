package fr.vincefop;

/**
 * Class qui permet d'instancier les pokemons
 * @author Administrateur
 * elle a des attributs nom , points de vie, puissance d'attaque
 */
public abstract class Pokemon {
	//LesATTRIBUTS
	private String nom;
	private double hp;
	private double atk;


	//CONSTRUCTEURS
	/**
	 * Un constructeur de base
	 */
	public Pokemon() {}
	
	/**
	 * Un constructeur qui ne donne que le nom
	 * car un pokemon peut évoluer au niveau des points de vie et de l'attaque
	 *
	 */
	public Pokemon(String nom) {
		this.nom = nom;
	}

	/**
	 * Le constructeur avec tous les attributs en paramètres
	 * @param nom
	 * @param hp
	 * @param atk
	 */
	public Pokemon(String nom, double hp, double atk) {
		this.nom = nom;
		this.hp = hp;
		this.atk = atk;
	}
	
	/**
	 * Méthode qui vérifie si le pokemon est mort ou pas 
	 * @return vrai ou faux si le pokemon est mort ou pas
	 */
	public boolean isDead() {
		boolean dead = false;
		if(this.hp<=0) dead = true;
		return dead;
	}
	
	/**
	 * Méthode qui permet d'attaquer un autre pokemon en paramètre
	 *@param p Pokemon
	 *le pokemon p passé en paramètre perd des points de vie
	 */
	public void attaquer(Pokemon p) {
		p.hp -= this.atk;
	}
	
	
	//Les getters et les setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public double getAtk() {
		return atk;
	}
	public void setAtk(double atk) {
		this.atk = atk;
	}

	/**
	 * Méthode to strng
	 * 
	 */
	@Override
	public String toString() {
		return "Pokemon [nom=" + nom + ", hp=" + hp + ", atk=" + atk + "]";
	}

	
	
	
}
