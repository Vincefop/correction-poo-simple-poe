package fr.vincefop;

	
	/**
	 * La classe PokemonPlante forte en attaque contre l'eau
	 * faible contre les plantes et le feu
	 * normal contre les pokemons normaux
	 * @author Administrateur
	 *
	 */
public class PokemonPlante extends Pokemon{
	
	
	//constructeur de base
	public PokemonPlante() {
		
	}
	
	/**
	 * Constructeur de la classe abstraite
	 */
	public PokemonPlante(String name, int hp, int atk) {
		super(name, hp, atk);
	}
	
	/**
	 * Je redéfinis la méthode attaquer
	 */
	@Override
	public void attaquer(Pokemon p) {
		//Je veux vérifier si le pokemon p est un PokemonFeu, eau, plante ou normal
		if(p instanceof PokemonFeu || p instanceof PokemonPlante) {
			p.setHp( p.getHp() - this.getAtk()/2 );
		}else if(p instanceof PokemonEau) {
			p.setHp( p.getHp() - 2*this.getAtk() );
		}else {
			p.setHp( p.getHp() - this.getAtk() );
		}
	}
		
		
}
	
