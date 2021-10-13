package fr.vincefop;

import java.util.ArrayList;

/**
 * Classe décrivant un étudiant
 * @author Administrateur
 *
 */
public class Student extends Person{
	String nom;
	ArrayList<Integer> notes;
	
	/**
	 * COnstructeur
	 */
	public Student(){
		
	}
	/**
	 * Constructeur de notes
	 * @param nom
	 * @param newNotes
	 */
	public Student(String nom, int...newNotes) {
		super();
		this.nom = nom;
		notes = new ArrayList<>();
		for (int note : newNotes) {
			this.notes.add(note);
		}
		
	}
	
	public Student(String nom, ArrayList<Integer>newNotes) {
		super();
		this.nom = nom;
		this.notes = newNotes;
		
	}
	
	public double calculMoyenne() {
		double moyenne = 0;
		for (double note : notes) {
			moyenne +=note;
		}
		moyenne /= notes.size();
		return moyenne;
	}
	
	public void show() {
		System.out.println("L'étudiant s'appelle : " 
				+ nom
				+ ". Et sa note moyenne est  : " 
				+ calculMoyenne()
				);
	}
	
	public void goToClasses() {
		System.out.println("I'm going to class");
	}
	
	public void DisplayAge() {
		System.out.println("My age is: " + this.age + " years old");
	}
	
	
}
