package fr.vincefop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
//		Vehicule v1 = new Vehicule();
//		
//		System.out.println(v1.toString());
//		
//		v1.marque = "Tesla";
////		v1.couleur = "Rouge";
//		v1.repeindre("blanche"); 
//		v1.prix = 10.99;
//		
//		System.out.println(v1.couleur);
//		
//		Vehicule v2 = new Vehicule( "Verte", "Renault", 17.99);
//		System.out.println(v2);
//		
//		Vehicule v3	= new Vehicule("Peugeot", 22.99);
//		v3.repeindre("Jaune");
//		System.out.println(v3);
		
//		
		
		
		
		//Exercice Rectange
//		Rectangle r = new Rectangle(3,4);
//		System.out.println(r.toString());
//		System.out.println("La surface du rectangle est : " + r.surface());

		//Exercice Somme
//		double entier1 = Tools.inputDouble("Donnez moi un entier : ");
//		double entier2 = Tools.inputDouble("Donnez moi un deuxième entier : ");
//		Somme s = new Somme(entier1,entier2);
//		System.out.println("La somme des deux entiers est  : " + s.sum());
		
		//Exercice Etudiant
		//Le nom de l'étudiant
//		String name = Tools.inputString("Veuillez entrer le nom de l'élève :");
//		//On va rentrer les notes tant qu'il y en a à ajouter
//		boolean encoreNote = true;
//		//On crée un ensemble de notes
//		ArrayList<Integer> notes = new ArrayList<>();
//		//Tant que l'utilisateur a encore des notes à rentrer 
//		while(encoreNote) {
//			//on prend la nouvelle note
//			int note1 = Tools.inputInt("Entrez la note 1 : ");
//			//on l'ajoute à la liste
//			notes.add(note1);
//			//on vérifie s'il reste des notes
//			char reponse = Tools.inputChar("Voulez vous ajouter une note ? y n ");
//			//si non on sort
//			if(reponse=='n') encoreNote = false;
//		}
//		//On crée un nouvel étudiant avec ces param
//		Student etu = new Student(name, notes);
//		etu.show();
		
//		Student etu2 = new Student("Gerard",10,20,30);
//		etu2.show();
		
//		//Exercice Addition Complexe
//		System.out.println("Premier Nombre");
//		int premierReel = Tools.inputInt("Veuillez entrer le premier réel :");
//		int premierImag = Tools.inputInt("Veuillez entrer le premier imaginaire :");
//		Complex c1 = new Complex(premierReel, premierImag);
//		
//		System.out.println("Deuxième Nombre");
//		int deuxReel = Tools.inputInt("Veuillez entrer le deuxième réel :");
//		int deuxImag = Tools.inputInt("Veuillez entrer le deuxième imaginaire :");
//		Complex c2 = new Complex(deuxReel, deuxImag);
//		
//		c1.additionComplexe(c2);
		
		//Exercice POints
//		int x1 = Tools.inputInt("Noter le x1 du premier point :");
//		int y1 = Tools.inputInt("Noter le y1 du premier point :");
//		
//		int x2 = Tools.inputInt("Noter le x2 du second point :");
//		int y2 = Tools.inputInt("Noter le y2 du second point :");
//		
//		Point p1 = new Point(x1, y1);
//		System.out.println("Point 1 = " + p1.toString());
//		Point p2 = new Point(x2, y2);
//		System.out.println("Point 2 = " + p2.toString());
//		
//		p1.distance(p2);
		
//		Point p3 = new Point(5,6);
//		Point p4 = new Point(3,2);
//		p3.distance(p4);
		
		//Exercice 06 Heritage
//		Person p = new Person();
//		p.sayHello();
//		
//		Student s = new Student();
//		s.sayHello();
//		s.goToClasses();
//		s.setAge(15);
//		s.DisplayAge();
//		
//		Teacher t = new Teacher();
//		t.setAge(40);
//		t.sayHello();
//		t.explain();
		
		//Exercice 07 MAISON
//		Apartment app = new Apartment();
//		Person person = new Person( "Albert", app);
//		person.display();
		
		
		//Exercice 08 POKEMON
//		Pokemon p0 = new PokemonNormal("Philipe", 100, 25);
//		Pokemon p1 = new PokemonEau("Gerard", 100 , 25);
//		Pokemon p2 = new PokemonFeu("Oli", 100, 25);
//		Pokemon p3 = new PokemonPlante("Joe", 100, 25);
//		
//		//Je crée une liste dans laquelle se trouvent mes pokemons 
//		List<Pokemon> poks = new ArrayList<>();
//		poks.add(p0);
//		poks.add(p1);
//		poks.add(p2);
//		poks.add(p3);
//		
//		//et tout le monde se tape dessus de manière aléatoire
//		//donc on va mettre une variable pour voir si quelqu'un est encore debout
//		boolean survivants = true;
//		while(survivants) {
//			//un pokemon au hasard tape au hasard
//			int index1 = new Random().nextInt(poks.size());
//			int index2 = new Random().nextInt(poks.size());
//			while(index2==index1) {
//				index2 = new Random().nextInt(poks.size());
//			}
//			Pokemon poke1 = poks.get(index1);
//			Pokemon poke2 = poks.get(index2);
//			poke1.attaquer(poke2);
//			
//			System.out.println(poke2.getNom() + " se fait rosser par " + poke1.getNom() + ". Il lui reste " + poke2.getHp());
//			
//			//sortons les morts de la liste
//			if(poke2.isDead()) {
//				poks.remove(index2);
//				System.out.println(poke2.getNom() + " IS DEAD");
//			}
//			
//			//On vérifie qu'il reste au moins deux personnes vivantes
//			int pokVivants = 0;
//			for (Pokemon pokemon : poks) {
//				if(!pokemon.isDead()) pokVivants++;
//				if(pokVivants>1) break;
//			}
//			if(pokVivants<2) survivants = false;
//		}
//		System.out.println("THE WINNER IS " + poks.get(0).getNom());
		
		
		
		
		
	}

}
