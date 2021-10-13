package fr.vincefop;

/**
 * La classe PokemonEau forte en attaque contre le feu
 * faible contre les plantes et l'eau
 * normal contre les pokemons normaux
 * @author Administrateur
 *
 */
public class PokemonEau extends Pokemon {
	
	//constructeur de base
	public PokemonEau() {
		
	}
	/**
	 * Constructeur de la classe abstraite
	 */
	public PokemonEau(String name, int hp, int atk) {
		super(name, hp, atk);
	}
	
	/**
	 * Je redéfinis la méthode attaquer
	 */
	@Override
	public void attaquer(Pokemon p) {
		//Je veux vérifier si le pokemon p est un PokemonFeu, eau, plante ou normal
		if(p instanceof PokemonPlante || p instanceof PokemonEau) {
			p.setHp( p.getHp() - this.getAtk()/2 );
		}else if(p instanceof PokemonFeu) {
			p.setHp( p.getHp() - 2*this.getAtk() );
		}else {
			p.setHp( p.getHp() - this.getAtk() );
		}
	}
	
	
}
