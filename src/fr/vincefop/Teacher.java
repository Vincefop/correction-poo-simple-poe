package fr.vincefop;

public class Teacher extends Person{
	
	@SuppressWarnings("unused")
	private String subject;

	public void explain() {
		System.out.println("The explanation begins...");
	}
}
