package fr.vincefop;

/**
 * La classe PokemonFeu forte en attaque contre les plantes
 * faible contre l'eau et le feu
 * normal contre les pokemons normaux
 * @author Administrateur
 *
 */
public class PokemonFeu extends Pokemon{
	
	//constructeur de base
	public PokemonFeu() {
		
	}
	/**
	 * Constructeur récupéré de la classe abstraite
	 */
	public PokemonFeu(String name, int hp, int atk) {
		super(name, hp, atk);
	}
	
	
	/**
	 * Je redéfinis la méthode attaquer
	 */
	@Override
	public void attaquer(Pokemon p) {
		//Je veux vérifier si le pokemon p est un PokemonFeu, eau, plante ou normal
		if(p instanceof PokemonFeu || p instanceof PokemonEau) {
			p.setHp( p.getHp() - this.getAtk()/2 );
		}else if(p instanceof PokemonPlante) {
			p.setHp( p.getHp() - 2*this.getAtk() );
		}else {
			p.setHp( p.getHp() - this.getAtk() );
		}
	}
	
	
}
