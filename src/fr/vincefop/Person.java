package fr.vincefop;
/**
 * 
 * @author Administrateur
 *
 */
public class Person {
	
	int age;
	String nom;
	House maison;
	
	/**
	 * CONSTRUCTORS
	 */
	public Person() {}
	
	public Person(String name, House maison) {
		this.nom = name;
		this.maison = maison;
	}
	
	public Person(int age, String nom, House maison) {
		this.age = age;
		this.nom = nom;
		this.maison = maison;
	}

	
	public void setAge(int n) {
		this.age = n;
		System.out.println("This person has " + this.age + " years old.");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public void saySmth(String message) {
		System.out.println(message);
	}
	
	public void display() {
		System.out.println("My name is " + nom + ". \nMy house: ");
		maison.Display();
		System.out.println("My Door: ");
		maison.getDoor().Display();
	}
}
